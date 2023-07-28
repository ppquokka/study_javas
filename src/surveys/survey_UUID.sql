SELECT *
FROM db_survey.statistics;

delete from statistics
where RESPONDENTS_ID= 'R1';

SELECT *
FROM db_survey.statistics;

insert into statistics
(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)
values
('UUID-01', 'R1', 'Q1', 'C1')
,('UUID-02', 'R1', 'Q2', 'C2')
,('UUID-03', 'R1', 'Q3', 'C3')
,('UUID-04', 'R1', 'Q4', 'C1')
;