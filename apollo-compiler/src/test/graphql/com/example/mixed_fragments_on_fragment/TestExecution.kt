package com.example.mixed_fragments_on_fragment

import okio.Buffer

object TestExecution {
  val String.asBuffer: Buffer get() = Buffer().apply { write(toByteArray()) }

  fun test() {
    TestQuery().parse("""{
      "data": {
        "hero": {
          "__typename": "Droid",
          "friends": [{
              "__typename": "Droid",
              "id": "2001",
              "primaryFunction": "Astromech"
           }]
        }
      }
    }""".asBuffer)
  }

  @JvmStatic
  fun main(args: Array<String>) = test()
}
