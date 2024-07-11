fun main()
{
    var hashMap: HashMap<String, Int> = HashMap<String, Int> ()

    printHashMap(hashMap)

    hashMap.put("IronMan" , 3000)
    hashMap.put("Thow" , 100)
    hashMap.put("SpiderMAn", 1100)
    hashMap.put("NickFury", 1200)
    hashMap.put("HawkEye", 1300)

    printHashMap(hashMap)

    println("hashMap : " +hashMap + "\n")
    for(key in hashMap.keys){
        println("Element at key $key : ${hashMap[key]}")
    }

    var secondHashMap : HashMap<String,Int> = HashMap<String, Int>(hashMap)
    println("Second hashMap")
    for(key in secondHashMap.keys)
    {println("Element at key $key: ${hashMap.get(key)}")}

    println("hashMap.clear()")
    hashMap.clear()
    println("After Clearing :" + hashMap)    
}

fun printHashMap(hashMap : HashMap<String, Int>){
    if(hashMap.isEmpty()){
        println("hashMap is empty")
    }
    else{
        println("hashMap : " + hashMap)
    }
}