package com.abhi

/**
  * Created by ASrivastava on 7/18/17.
  */
class MyLibrary {
   def doFoo(id: Long, request: Request) = {
      println("came inside real implementation")
      Response(id, request.name)
   }
}

case class Request(name: String)
case class Response(id: Long, name: String)