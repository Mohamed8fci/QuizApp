package com.example.quizapp

object constants{

    const val USER_NAME: String = "username"
    const val TOTAL_QUESTIONS: String ="total_questions"
    const val CORRECT_ANSWERS: String ="correct_Answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,"What country does flags belong to?"
        ,R.drawable.ic_flag_of_argentina,
            "Argentina"
            ,"Australia"
            ,"America",
            "Armenia"
            ,1)

    questionsList.add(que1)

        val que2 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_australia,
            "Argentina"
            ,"Australia"
            ,"Egypt",
            "Saudi Arabic"
            ,2)

        questionsList.add(que2)

        val que3 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_belgium,
            "Argentina"
            ,"Australia"
            ,"America",
            "Belgium"
            ,4)

        questionsList.add(que3)


        val que4 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_brazil,
            "Argentina"
            ,"Australia"
            ,"brazil",
            "France"
            ,3)

        questionsList.add(que4)

        val que5 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_denmark,
            "Argentina"
            ,"Italy"
            ,"france",
            "Denmark"
            ,4)

        questionsList.add(que5)

        val que6 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_fiji,
            "Fiji"
            ,"Spain"
            ,"Brazil",
            "Armenia"
            ,1)

        questionsList.add(que6)

        val que7 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_germany,
            "Argentina"
            ,"Germany"
            ,"America",
            "Tunis"
            ,2)

        questionsList.add(que7)

        val que8 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_india,
            "Argentina"
            ,"Italy"
            ,"India",
            "Spain"
            ,3)

        questionsList.add(que8)

        val que9 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_kuwait,
            "Argentina"
            ,"Kuwait"
            ,"Egypt",
            "France"
            ,2)

        questionsList.add(que9)

        val que10 = Question(1,"What country does flags belong to?"
            ,R.drawable.ic_flag_of_new_zealand,
            "New-Zealand"
            ,"Egypt"
            ,"America",
            "Iran"
            ,1)

        questionsList.add(que10)


        return questionsList
    }

}