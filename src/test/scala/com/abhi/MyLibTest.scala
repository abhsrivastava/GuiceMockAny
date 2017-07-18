package com.abhi

import com.google.inject.{AbstractModule, Guice}
import net.codingwell.scalaguice.ScalaModule
import org.scalatest.{FunSpec, Matchers}
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._
import org.mockito.ArgumentMatchers._
import net.codingwell.scalaguice.InjectorExtensions._

/**
  * Created by ASrivastava on 7/18/17.
  */
class MyLibTest extends FunSpec with Matchers{
   describe("this is my test") {
//      it("should use mock module") {
//         val injector = Guice.createInjector(new MockModule)
//         val lib = injector.instance[MyLibrary]
//         lib.doFoo(1, Request("bar"))
//      }
      it("should use mock module") {
         val lib = new MyLibrary()
         val mock = spy(lib)
         doReturn(Response(10, "mock"), Array.empty:_*).when(mock).doFoo(any(), any())
         val response = mock.doFoo(1, Request("bar"))
         response.name should equal("mock")
      }
   }
}

class MockModule extends AbstractModule with ScalaModule with MockitoSugar{
   override def configure(): Unit = {
      val injector = Guice.createInjector(new MyModule)
      val lib = injector.instance[MyLibrary]
      val x = spy(lib)
      when(x.doFoo(anyLong(), any[Request])).thenReturn(Response(10, "mock"))
      bind[MyLibrary].toInstance(x)
   }
}
