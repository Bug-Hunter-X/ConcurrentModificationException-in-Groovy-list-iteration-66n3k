def someMethod() {
    def list = [1, 2, 3, 4, 5]
    def toRemove = []
    list.eachWithIndex { item, index ->
        if (item == 3) {
            toRemove << index
        }
    }
    toRemove.reverse().each{index -> list.remove(index)}
    println list
}
someMethod() 