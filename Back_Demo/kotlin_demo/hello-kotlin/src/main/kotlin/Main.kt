//open class Animal {
//    var name = ""
//    open fun makeSound() {
//        println("我是${this.name},我会叫")
//    }
//}
//
//class Dog : Animal() {
//    override fun makeSound() {
//        println("我是${this.name}，我会汪汪叫")
//    }
//}
//open class Animal {
//    open var age: Int = 0
//        get() {
//            println("Getting name from Animal")
//            return field
//        }
//        set(value) {
//            println("Setting name in Animal")
//            field = value
//        }
//}
//
//class Dog : Animal() {
//    override var age: Int = 0        // 覆盖父类的属性
//        get() {
//            println("Getting age from Dog")
//            return if (field < 0) 0 else field        // 修改获取的逻辑
//        }
//        set(value) {
//            field = value
//            println("Setting age in Dog")
//        }
//}
/*open class Animal {
    open var name = "动物"

    open fun makeSound() {
        println("我是${this.name}，我会叫")
    }
}

class Dog : Animal() {
    override var name = "狗"

    override fun makeSound() {
        println("我原来是${super.name}, 我现在是${this.name}，我会汪汪叫")	// 调用父类属性和子类属性
    }

    fun test() {
        super.makeSound()  // 使用super调用父类的方法
        this.makeSound()   // 使用this调用子类的方法
    }
}*/
//class Student(var name: String, var age: Int) {
//    companion object {
//        var stuCount: Int = 0
//        fun getCount(): Int {
//            return stuCount
//        }
//    }
//
//    init {
//        stuCount++
//    }
//}

fun main() {
//    val stu1 = Student("doubi", 12)
//    println(Student.stuCount)
//    Student.stuCount = 5
//    println(Student.stuCount)
//    val dog = Dog()
//    dog.test()
//    var dog = Dog()
//    dog.name = "doubi"
//    dog.makeSound()
//    val stu1 = Student("123", -1)
//    println(stu1.age)
//    stu1.study()
//    val getCount: () -> Int = {
//        println("hello")
//        3
//    }
//    val count = getCount()
//    println(count)
//    val func = ::compute
//    val result = func(1, 2)
//    println(result)
//    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
//    val even = numbers.filter { it % 2 == 0 }
//    println(even)
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val doubledNumbers = numbers.map { it * 2 }
//    println(doubledNumbers)
//    var number = 10
//    val result = number.takeIf { it > 1 }
//    println(result)
//    val str:String = "123"
//    str.also {
//        println(it)
//    }.also {
//        val content = "hello ${it}"
//        println(content)
//    }
//    val username = "HelloworldImtheking";
//    val tooLong = username.run { length > 60 }
//    println(tooLong)
//    val list = listOf(3, 2, 3)
//    val result = list.first().let {
//        it * it
//    }
//    println(result)
//    val person = Person("jasd", 30)
//    println(person)
//    println(person.age)
//    val person = Person("json",30).apply {
//        name = "jane"
//        age = 25
//        println("nihao")
//    }
//    println(person)
//    val str = "123"
//    str.forEach {
//        println(it)
//    }
//    val str = "Hello, World!"
//    val substring = str.substring(7, 12) // 从索引 7 到 11 的子字符串
//    println(substring) // 输出 "World"
//    val emptyMap = mutableMapOf<String, Int>()
//    emptyMap["one"] = 1
//    emptyMap.put("two", 2)
//    println(emptyMap.size)
//    println(emptyMap)
//    for ((key, value) in emptyMap) {
//        println("$key - $value")
//    }
//    println(emptyMap.contains("two"))
//    if (emptyMap.isNotEmpty()) {
//        println("map is not null")
//    }
//    emptyMap.forEach {
//        println("${it.key} - ${it.value}")
//    }
//    for ((key, value) in emptyMap) {
//        println("$key - $value")
//    }
//    println(emptyMap.get("one"))
//    val value2 = emptyMap.putIfAbsent("one1", 2)
//    println(value2)
//    val value3 = emptyMap.getOrPut("one2") {1}
//    println(value3)
//    val set1 = setOf(1, 2, 3)
//    val set2 = setOf(3, 4, 5)
//    val unionSet = set1.intersect(set2)
//    println(unionSet)
//    val fruits = mutableSetOf<String>()
//    fruits.add("2")
//    println(fruits.size)
//    val list1 = mutableListOf<String>()
//    list1.add("double")
//    list1+="asd"
//    val numbers = listOf(1,2,3,4,5)
//    val even = numbers.filter { it % 2 == 1 }.map { it * 2 }
//    val f = numbers.all { it % 2 == 0 }
//    println(f)
//    val (one,two) = list1
//    println(one)
//    if (list1.isNotEmpty()) {
//        println("集合不为空")
//    }
//    val list1String = list1.joinToString(",")
//    println(list1String)
//    println(list1)
//    list1.add(3,"123")
//    println(list1)
//    println(list1.size)
//    for (list in list1) {
//        println(list)
//    }
//    val numbers1 = IntArray(5)
//    println(numbers1.size)
//    println(numbers1[0])
//    val sum:(x:Int,y:Int)->Int={
//        x, y ->
//        println("${x}+${y}")
//        x +y
//    }
//    val result = sum(3,4)
//    println("$result")
//    val  func = ::compute
//    val result = func(1,2)
//    println(result)
//    println(add(1,2))
//    printNumbers(1, 2, 3)
//    printNumbers(1, 2, 3, 4, 5)
//    println("Hello World!")
//    var age: Int = 18
//    println(age)
//    val pi2 = 3.1412
//    println(pi2)
//    var a = 1..10
//    var a1 = 1 until 10
//    var str : String?=null
//    println(str?.length)
//    val name:String? = "123"
//    val content:String?= name?.let{
//        println(it.length)
//        "Hello ${it}"
//    }
//    println(content)
//    val name:String? = "Doubi"
//    var name2:String? = null
//    name?.let {
//        name2 = name
//    }
//    println(name2)
//    val list1 = mutableListOf<String>()
//    list1.add("enen")
//    list1 +="123"
//    println(list1)
//    val numbers = listOf(1,2,3,4,5)
//    val evenNuasd = numbers.filter { it % 2 == 0 }
//
//    println(list1[0])
//    println(list1.last())
//    list1.add(1,"caibi")
//    println(list1)
//    list1.removeIf {it == "caibi"}
//    println(list1)
//    list1.clear()
//    println(list1)
//    val list2 = mutableListOf<String>()
//    list2.addAll(list1)
//    println(list2)
//    println(list2.size)
//    var list2 = mutableListOf("123")
//    val immutableList = listOf(1, 2, 3)
//    val list = mutableListOf<String>()
//    val number1: Array<Int> = arrayOf(1, 2, 3)
//    val iterator = number1.iterator()
//    while (iterator.hasNext()) {
//        val color = iterator.next()
//        println(color)
//    }
//    for (index in number1.indices) {
//        println("$index,${number1[index]}")
//    }
//    number1.forEach { elem ->
//        println(elem)
//    }
}


//fun printNumbers(vararg numbers: Int) {
//    for (num in numbers) {
//        println(num)
//    }
//
//    println(numbers[0])     // 取出第一个参数
//    println(numbers[1])     // 取出第二个参数
//}
//fun add(a: Int, b: Int) = a + b
//fun compute(x:Int,y:Int):Int {
//    return x + y
//}
//fun compute(x: Int, y: Int): Int {
//    return x + y
//}
//data class Person(var name: String, var age: Int)
//class Student(name: String, age: Int) {
//    var name: String
//    var age: Int
//
//    init {
//        this.name = name
//        this.age = if (age >= 0) age else 0
//    }
//
//    fun study() {
//        println("我是$name，我${age}岁了，我在学习")
//    }
//}