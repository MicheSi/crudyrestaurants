DELETE
FROM EMPLOYEETITLES;

DELETE
FROM EMAILS;

DELETE
FROM JOBTITLES;

DELETE
FROM EMPLOYEES;

INSERT INTO EMPLOYEES (EMPLOYEEID, NAME)
    VALUES (1, 'CINNAMON'),
           (2, 'BARNBARN'),
           (3, 'JOHN');

INSERT INTO EMAILS (EMAILID, EMAIL, EMPLOYEEID)
    VALUES (1, 'hops@local.com', 1),
           (2, 'bunny@hoppin.local', 1),
           (3, 'barnbarn@local.com', 2);

INSERT INTO JOBTITLES (JOBTITLEID, TITLE)
    VALUES (1, 'Big Boss'),
           (2, 'Wizard');

INSERT INTO EMPLOYEETITLES (EMPLOYEEID, JOBTITLEID)
    VALUES (1, 1),
           (1, 2),
           (2, 2);

/*
Must tell hibernate of the id numbers already used.
The number after with must be greater that the highest number id assigned.
 */
alter sequence hibernate_sequence restart with 15;