package com.abhi

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions._
/**
  * Created by ASrivastava on 7/18/17.
  */
object MyApp extends App{
   val injector = Guice.createInjector(new MyModule)
   val l = injector.instance[MyLibrary]
   println(l.doFoo(1, Request("abhi")))
}
