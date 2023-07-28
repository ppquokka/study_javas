SELECT T_QC.QUESTIONS_ID, T_Q.QUESTIONS, T_C.CHOICE
FROM question_choice as T_QC
   inner join questions as T_Q
   on T_QC.QUESTIONS_ID = T_Q.QUESTIONS_ID
   inner join choice as T_C
   on T_QC.CHOICE_ID = T_C.CHOICE_ID
order by T_QC.QUESTIONS_ID, T_QC.CHOICE_ID
;