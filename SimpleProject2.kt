fun main(){
var books = mutableListOf<Pair<String,String>>()
//admin(books)

    println("Welecome to laibrary, select your position!")
    println("The positions are \n 1) Admin \n 2) User \n 3) Exit ")
    
    while(true){
        print("Enter your choice: ")
        var userChoice = readln()?.toLowerCase()
    if(userChoice != "admin" && userChoice != "user" && userChoice != "exit"){
        print("Enter Correct choice!!")
        
    }
    else{
        when(userChoice){
            "admin" -> {adminSecqurity(books)
                        break}
            "user" -> {user()
                        break}
            "Exit" -> {print("Lets meet again")
                        break
                        }
        }
    }
    }
}

fun adminSecqurity(boookss:MutableList<Pair<String,String>>){
    print("this system was locked, Enter secret code to: ")
    var secret = "9842"
    while(true){
        var chance = readln()
        if(chance == secret){ 
                admin(boookss)
        }else{break}
    }
}

fun admin(book: MutableList<Pair<String,String>>){
    println("Hi admin, what do you want")
    print("1)Add \n 2)Remove \n3)Exit")
    println()
    print("Enter your Choice :")

    while(true){
        val choice = readLine()?.lowercase()
        if(choice.isNullOrEmpty()){
        println("Enter valid choice!!")
    }
    if(choice != "add" && choice != "remove" && choice != "exit"){
        println("Enter correct choice : ")
    }
        else{
            when(choice){
                "add"->{println("Hi the count books in the selfs are ${book.size}\nAdd New book(If done type 'done')")
                            while(true){
                                println()
                                print("Enter the book name :")
                                var BookName = readLine()!!.lowercase()
                                println()
                                print("Enter the author name")
                                var AuthorName = readLine()!!.lowercase()
                                if(BookName == "done"){break}
                                book.add(Pair(BookName,AuthorName))

                            }}
                "remove"->{print("The number of books in the database ${book.size}\n Remove books(if done type ''done')")
                            while(true){
                                if(book.isEmpty()){
                                println("The database was empty")
                                break
                                }
                                print("Enter the book name:")
                                var BookName = readLine()?.lowercase()
                                if(BookName == "done"){break}
                                 var BookToRemove = book.find{it.first == BookName}
                                    if (BookToRemove != null){
                                        book.remove(BookToRemove)
                                        print("Book removed : ${BookToRemove}")
                                    }
                                    else {
                                        print("The book was not removed")
                                    }
                            }
                            
                            }
                            "exit"->{break}
                    }
                
                
                
            }
        }
    }


fun user(){
    print("hello")
}
