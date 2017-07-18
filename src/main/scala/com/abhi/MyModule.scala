package com.abhi

import com.google.inject.{AbstractModule, Provides}
import net.codingwell.scalaguice.ScalaModule

/**
  * Created by ASrivastava on 7/18/17.
  */
class MyModule extends AbstractModule with ScalaModule{
   override def configure(): Unit = {

   }

   @Provides
   def getMyLIb() : MyLibrary = {
      new MyLibrary()
   }
}
