package com.example.demo

import org.junit.Test
import org.mockito.Mockito

class MockingTests {
	@Test
	fun `Can mock interface with extension function with lambda`() {
		Mockito.mock(InterfaceWithExtensionFunctionWithLambda::class.java)
	}

	@Test
	fun `Can mock interface with extension function`() {
		Mockito.mock(InterfaceWithExtensionFunction::class.java)
	}

	@Test
	fun `Can mock interface with function with lambda`() {
		Mockito.mock(InterfaceWithFunctionWithLambda::class.java)
	}

	@Test
	fun `Can mock interface with function with generic lambda`() {
		Mockito.mock(InterfaceWithFunctionWithGenericLambda::class.java)
	}

	@Test
	fun `Can mock interface with extension function on collection`() {
		Mockito.mock(InterfaceWithExtensionFunctionOnCollection::class.java)
	}

}
