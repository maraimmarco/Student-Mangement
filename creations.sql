
   create table student (
    national_id number(16) primary key not null ,
    first_name varchar2(20) not null ,
    last_name varchar2(20) not null ,
    user_name varchar2(20) not null ,
    email varchar2(50) not null ,
    phone varchar2(50) not null ,
    date_of_birth DATE not null ,
    track_id number(10),
    constraint track_fk foreign key (track_id) references track(track_id)
   );
   
   insert into student (national_id,first_name,last_name,user_name,email,phone,date_of_birth,track_id)
   values (12345678910,'mariam','marcos','mariam_marcos','mariammarcos@gmail.com','221166306',to_date('14/3/1997','DD/MM/YYYY'),1000);
   insert into student (national_id,first_name,last_name,user_name,email,phone,date_of_birth,track_id)
   values (23456789110,'menna ','mamdouh','menna_mamdouh','mennamamdhouh@gmail.com','203949480',to_date('7/1/1999','DD/MM/YYYY'),1000);
   insert into student(national_id,first_name,last_name,user_name,email,phone,date_of_birth,track_id)
   values (34567891210,'fady','noshy','fady_noshy','fadynoshy@gmail.com','282883840',to_date('7/12/1996','DD/MM/YYYY'),1010);
   
   insert into student (national_id,first_name,last_name,user_name,email,phone,date_of_birth,track_id)
   values (45678912310,'shemoua','shokry','shemoua_shokry','shemouashokry@gmail.com','221166306',to_date('12/9/1998','DD/MM/YYYY'),1020);
   
   create table student_graduation (
        grade_id number(20) primary key,
        grade varchar2(20) not null 
          );
         
          create sequence grade_id 
          start with 10 
          increment by 10;
          alter table student_graduation 
          drop column date_of_grade;
          insert into student_graduation (grade_id,grade)
          values (grade_id.nextval,'A');
          insert into student_graduation(grade_id,grade)
          values(grade_id.nextval,'B');
          insert into student_graduation(grade_id,grade)
          values(grade_id.nextval,'C');
          insert into student_graduation(grade_id,grade)
          values(grade_id.nextval,'D');
   create table faculty (
        faculty_id number(10) primary key ,
        faculty_name varchar2(20) not null 
   );
   create sequence faculty_id 
   start with 5
   increment by 5;
   insert into faculty (faculty_id,faculty_name)
   values(faculty_id.nextval,'faculty of science ');
   insert into faculty (faculty_id,faculty_name)
   values(faculty_id.nextval,'faculty of arts ');
   insert into faculty (faculty_id,faculty_name)
   values(faculty_id.nextval,'engineering');

   create table student_faculty_grade(
        student_id number(16) not null ,
        grade_id number(20) not null ,
        faculty_id number(10) not null,
        constraint student_fk foreign key (student_id)references student(national_id),
        constraint garde_fk foreign key (grade_id) references student_graduation(grade_id),
        constraint faculty_fk foreign key (faculty_id)references faculty(faculty_id),
        constraint pk_student_faculty_grade  primary key (student_id,grade_id,faculty_id)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
   );
   insert into student_faculty_grade(student_id,grade_id,faculty_id)
   values (12345678910,20,5);   
   insert into student_faculty_grade(student_id,grade_id,faculty_id)
   values(23456789110,10,25);
   insert into student_faculty_grade(student_id,grade_id,faculty_id)
   values(34567891210,10,25);
   
   select first_name ,track_name,grade,faculty_name
    from student , student_faculty_grade, student_graduation ,faculty,track
    where national_id =student_id
    and student.track_id=track.track_id
    and student_faculty_grade.grade_id=student_graduation.grade_id
    and student_faculty_grade.faculty_id=faculty.faculty_id;

   create table subject(
    subject_code number(20) primary key ,
    subject_name varchar2(30) not null ,
);
   alter table subject 
drop column requirment;
    create sequence subject_code 
    start with 1 
    increment by 1;
    
    insert into subject(subject_code,subject_name)
    values (subject_code.nextval,'DataBase');
    insert into subject(subject_code,subject_name)
    values (subject_code.nextval,'PLSQL');
    insert into subject (subject_code, subject_name)
    values(subject_code.nextval,'java');
    insert into subject (subject_code,subject_name)
    values (subject_code.nextval,'python');
    insert into subject (subject_code,subject_name)
    values (subject_code.nextval,'machine learning');
    insert into subject(subject_code,subject_name)
    values(subject_code.nextval,'OOP');
    
   --do i add new column in subject with datatype date ?

    create table track (
    track_id number(10) primary key ,
    track_name varchar2(20) not null 
    );
    create sequence track_id 
    start with 1000
    increment by 10;
    insert into track (track_id,track_name)
    values (track_id.nextval,'data management');
    insert into track(track_id,track_name)
    values(track_id.nextval,'AI');
    insert into track(track_id,track_name)
    values(track_id.nextval,'2D');
    
    create table instructor (
    national_id number(16) primary key not null ,
    first_name varchar2(20) not null ,
    last_name varchar2(20) not null ,
    year_of_experince date ,
    salary number(20) ,
    cirtaficate varchar2(20) not null ,
    supervisor_id NUMBER(16),
    CONSTRAINT fk_supervisor FOREIGN KEY (supervisor_id) REFERENCES instructor(national_id)
  );
  
    INSERT INTO instructor (national_id, first_name, last_name, year_of_experince, salary, cirtaficate, supervisor_id)
VALUES (123456789, 'Rana', 'Dahish', TO_DATE('2010', 'YYYY'), 30000, 'AWS', NULL);
    insert into instructor (national_id ,first_name,last_name,year_of_experince,salary,cirtaficate,supervisor_id)
values (23456789,'Manar','Ahmed',to_date('2019','YYYY'),10000,'AZURE',123456789);
    insert into instructor (national_id,first_name,last_name,year_of_experince,salary,cirtaficate,supervisor_id) 
values(123456789987,'OUF','Mamdouh',to_date('1997','YYYY'),40000,'AWS',null);

  
    create table branch (
    branch_id number(10)primary key not null,
    city varchar2(20) not null ,
    address varchar2(20) not null ,
    manager_id number(16),
    constraint fk_manager foreign key (manager_id) references instructor(national_id)
  );
    create sequence branch_id 
  start with 10
  increment by 10;
    insert into branch(branch_id,city,address,manager_id)
    values (branch_id.nextval,'alexandria','kafer abdo',123456789987);
    insert into branch(branch_id,city,address,manager_id)
    values(branch_id.nextval,'zamalek','smart village',123456789);
   
   CREATE TABLE allocation (
    branch_id NUMBER(10)  NOT NULL,
    track_id NUMBER(10)  NOT NULL,
    CONSTRAINT pk_composite PRIMARY KEY (branch_id,track_id),
    CONSTRAINT fk_branch_id FOREIGN KEY (branch_id) REFERENCES branch(branch_id),
    CONSTRAINT fk_track_id FOREIGN KEY (track_id) REFERENCES track(track_id)
);
insert into allocation (branch_id,track_id)
values(30,1000);
insert into allocation(branch_id,track_id)
values(30,1010);
insert into allocation(branch_id,track_id)
values(40,1000);
insert into allocation (branch_id,track_id)
values(40,1010);

select track_name,city
from branch , track ,allocation 
where branch.branch_id=allocation.branch_id
and track.track_id=allocation.track_id;

create table taken_tab (
    subject_id number (20) not null ,
    track_id number(20) not null , 
    constraint composite_PK primary key (subject_id,track_id),
    constraint fk_subject_id foreign key (subject_id) references subject(subject_code),
    constraint fk_track_id_taken foreign key (track_id)references track(track_id)
);
insert into taken_tab(subject_id,track_id)
values(1,1000);
insert into taken_tab(subject_id,track_id)
values(2,1000);
insert into taken_tab(subject_id,track_id)
values(3,1000);
insert into taken_tab(subject_id,track_id)
values(6,1010);
insert into taken_tab(subject_id,track_id)
values(5,1010);


create table working (
    branch_id number(10) not null ,
    instructor_id number(16) not null ,
    constraint branch_fk foreign key (branch_id) references branch(branch_id),
    constraint instructor_fk foreign key (instructor_id)references instructor(national_id),
    constraint working_pk primary key (branch_id , instructor_id)
);

insert into working (branch_id, instructor_id)
values (30,123456789987);

insert into working (branch_id,instructor_id)
values(40,123456789);

insert into working (branch_id,instructor_id)
values(40,23456789);

select first_name , city, track_name 
from instructor ,  working , branch,track
where instructor.national_id=working.instructor_id
and branch.branch_id=working.branch_id
 ;

create table learning (
    student_id number(16) not null ,
    subject_code number(20) not null , 
    constraint student_id_fk foreign key (student_id ) references student (national_id ),
    constraint subject_id_fk foreign key (subject_code) references subject(subject_code),
    constraint learning_pk primary key (student_id,subject_code)
);

insert into learning (student_id,subject_code)
values(12345678910,1);

insert into learning (student_id,subject_code)
values (12345678910,2);

insert into learning (student_id,subject_code)
values (12345678910,3);

insert into learning(student_id,subject_code)
values (23456789110,1);

insert into learning (student_id,subject_code)
values(23456789110,2);

insert into learning (student_id,subject_code)
values(12345678910,2);

select first_name , subject_name 
from student , subject ,learning
where STUDENT.NATIONAL_ID=LEARNING.STUDENT_ID
and SUBJECT.SUBJECT_CODE=LEARNING.SUBJECT_CODE;

create table grade(
    grade_id number(10) primary key not null,
    grade varchar2(20) not null
);

insert into grade (grade_id,grade)values (1,'A');
insert into grade (grade_id,grade)values(2,'B');
insert into grade (grade_id,grade)values(3,'C');
insert into grade (grade_id,grade)values(4,'D');

create table sub_grade (
    subject_code number(20) not null,
    student_id number(16) not null ,
    grade_id number(10) not null ,
    constraint subject_code_fk foreign key (subject_code) references subject(subject_code),
    constraint student_id_fkey foreign key (student_id) references student(national_id),
    constraint grade_id_fk foreign key (grade_id) references grade(grade_id),
    constraint sub_grade_pk primary key (subject_code,student_id,grade_id)
);

select first_name , subject_name , grade , track_name 
from student , subject , grade , track ,sub_grade 
where student.national_id = sub_grade.student_id 
and subject.subject_code=SUB_GRADE.SUBJECT_CODE
and GRADE.GRADE_ID=SUB_GRADE.GRADE_ID
and track.track_id=student.track_id;

insert into sub_grade(subject_code,student_id,grade_id)
values (1,12345678910,1);

insert into sub_grade (subject_code,student_id,grade_id)
values(2,12345678910,2);

insert into sub_grade(subject_code,student_id,grade_id)
values(3,12345678910,3);

create or replace Type grade_array_type is Table of varchar2(2);
create or replace function calculate_gpa(grades in grade_array_type)
return number 
is 
    total_grade_value number :=0;
    total_grade number:=grades.count ;
begin  
    for i in 1..grades.count loop 
        case grades(i)
          when 'A' then total_grade_value :=total_grade_value+4;
          when 'B' then total_grade_value :=total_grade_value+3.5;
          when 'C' then total_grade_value := total_grade_value+3;
          when 'D' then total_grade_value :=total_grade_value+2.5;
          else total_grade_value :=total_grade_value+2;
          end case ;
    end loop;
   return total_grade_value/total_grade;
end calculate_gpa;
show errors;

 SET SERVEROUTPUT ON;
declare
    grade_array  grade_array_type := grade_array_type('A', 'B', 'C', 'A');
    result_number NUMBER(6,2);
begin
    result_number := calculate_gpa(grade_array);
    DBMS_OUTPUT.PUT_LINE('Calculated GPA: ' || result_number);
end;


