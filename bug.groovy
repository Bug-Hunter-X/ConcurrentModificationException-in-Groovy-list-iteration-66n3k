def someMethod() {
    def list = [1, 2, 3, 4, 5]
    list.eachWithIndex { item, index ->
        if (item == 3) {
            list.remove(item)
        }
    }
    println list
}
someMethod()