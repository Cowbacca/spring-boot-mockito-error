package com.example.demo

interface InterfaceWithExtensionFunctionWithLambda {
    fun String.extensionFunction(performAction: () -> String): String {
        return performAction()
    }
}

interface InterfaceWithExtensionFunction {
    fun String.extensionFunction(): String {
        return ""
    }
}

interface InterfaceWithFunctionWithLambda {
    fun functionWithLambda(performAction: () -> String): String {
        return performAction()
    }
}

interface InterfaceWithFunctionWithGenericLambda {
    fun <T> functionWithLambda(performAction: () -> T): T {
        return performAction()
    }
}

interface InterfaceWithExtensionFunctionOnCollection {
    fun Collection<String>.extensionFunctionOnCollection(): List<String> {
        return filter { true }
    }
}