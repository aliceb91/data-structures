package stack

class DataStack {

    var stack = mutableListOf<Any>()

    fun push(item: String) {
        stack.add(item)
    }

    fun pop():Any? {
        return stack.removeLastOrNull()
    }

    fun peek():Any? {
        return stack.lastOrNull()
    }
}