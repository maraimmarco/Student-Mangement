------------------------------------------------------------------------------------------------
SET SERVEROUTPUT ON;
DECLARE 
    first_name_var VARCHAR2(20);
    grade_var VARCHAR2(20);
    subject_name_var VARCHAR2(30);
    result NUMBER(8,2);
    grade_array grade_array_type := grade_array_type(); 
    CURSOR student_cursor IS
        SELECT first_name, grade, subject_name,track_name
        FROM learning, student, grade, subject,track
        WHERE learning.student_id = student.national_id
        AND learning.grade_id = grade.grade_id
        AND learning.subject_code = subject.subject_code
        and student.track_id=TRACK.TRACK_ID
        AND student.national_id = 12345678910;
BEGIN 
    FOR student_rec IN student_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('First Name: ' || student_rec.first_name);
        DBMS_OUTPUT.PUT_LINE('Grade: ' || student_rec.grade);
        DBMS_OUTPUT.PUT_LINE('Subject Name: ' || student_rec.subject_name);
        -- Adding the grade to the array
        grade_array.EXTEND;
        grade_array(grade_array.LAST) := student_rec.grade;
    END LOOP;
             -- Calculate GPA using the function
           result := calculate_gpa(grade_array);
        DBMS_OUTPUT.PUT_LINE('Calculated GPA: ' || result);
    IF student_cursor%NOTFOUND THEN
        DBMS_OUTPUT.PUT_LINE('No data found.');
    END IF;
    CLOSE student_cursor;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
------------------------------------------------------------------------------------------------

