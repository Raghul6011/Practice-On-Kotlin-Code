fun main()
{   
    var StudentInfo = mutableListOf<Pair<String,Double>>()
    StudentDetail(StudentInfo)
    //print("Class X student details are: ${}")
    println("Class X Average Score is: ${calculateAveragGrade(StudentInfo)}")
    println("Class X highest Score is: ${highest(StudentInfo)}")
    println("Class X lowesr Score is: ${lowest(StudentInfo)}")
}

fun StudentDetail(students1: MutableList<Pair<String,Double>>){
    while(true){
        print("Enter your Name(if done enter as 'Done'): ")
        var student = readLine()!!.lowercase()
        if(student == "done"){
            print("Thanks for your submision !")
            break
        }
        print("Enter your score in Numbers:")
        var Score = readLine()
        try{
            val grade = Score?.toDouble() ?: throw NumberFormatException()
            students1.add(Pair(student,grade))
        }
        catch(e: NumberFormatException){
            print("Enter a valid Number")
        }

    }
}
fun calculateAveragGrade(students: List<Pair<String,Double>>):Double{
    var total = students.sumByDouble{it.second}
    return total/students.size
}

fun highest(student2: List<Pair<String,Double>>):Double{
    var max = student2.maxByOrNull{it.second}?.second ?: 0.0
    return max
}

fun lowest(student3: List<Pair<String,Double>>):Double{
    var min = student3.minByOrNull{it.second}?.second ?: 0.0
    return min
}