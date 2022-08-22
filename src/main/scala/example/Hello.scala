package example

import org.jsoup.Jsoup

object Hello extends App {
  val textWithHtml = s"""
    |<h1>This is my comment</h1>
    |
    |<p>Lorem ipsum</p>
    |
    |<span>Thanks</span>
    |
    |""".stripMargin

  val parsed = Jsoup.parse(textWithHtml)

  println(s"Parsed = $parsed")
}

