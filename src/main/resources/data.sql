--
insert into classroom values (1,2,'UPT','A101');
insert into classroom values (2,30,'UPT','B520');
insert into classroom values (3,100,'Chimie Centru','303');
insert into classroom values (4,20,'UPT','C101');


insert into feature values (1, 'projector', 1);
insert into feature values (2, 'blackboard', 1);
insert into feature values (3, 'osciloscope', 2);
insert into feature values (4, 'projector', 3);

insert into user values (1,'UPT','John','George',1,'CTI_EN',3);
insert into user values (2,'UPT','Jimmy','Jim',2,'CTI_EN',3);
insert into user values (3,'UPT','Michael','Bob',1,'CTI_EN',3);
insert into user values (4,'UPT','Claire','Claire',2,'CTI_EN',3);

insert into class values (1,'Calculus','CTI-EN',1,2);
insert into class values (2,'Algebra','CTI-RO',1,2);
insert into class values (3,'Databases','CTI-EN',3,4);
insert into class values (4,'Calculus','CTI-EN',1,4);


insert into repartition values (1,1);
insert into repartition values (1,3);
insert into repartition values (3,2);
insert into repartition values (4,4);


insert into schedule values (1,'2021-04-21','2021-04-21',1);
insert into schedule values (2,'2021-04-22','2021-04-22',2);
insert into schedule values (3,'2021-04-22','2021-04-22',4);
insert into schedule values (4,'2021-04-24','2021-04-24',1);
insert into schedule values (5,'2021-04-22','2021-04-22',4);
insert into schedule values (6,'2021-04-21','2021-04-21',1);


insert into enroled_students values (1,1);
insert into enroled_students values (1,2);
insert into enroled_students values (3,1);




