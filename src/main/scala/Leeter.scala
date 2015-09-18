/**
 * Created by martin on 18/09/15.
 */
object Leeter {
	def leet(str: String): Seq[String] = str match{
		case x if x.length == 1 => leetChar(x)
		case x if x.length > 1 => leetChar(x.head.toString).flatMap(y=>leet(x.tail).map(z=>y+z))
	}

	def leetChar(c:String): Seq[String] = {
		((c match {
				case s if s.toLowerCase == "e" => "3" :: Nil
				case s if s.toLowerCase == "s" => "5" :: "$" :: Nil
				case s if s.toLowerCase == "o" => "0" :: Nil
				case s if s.toLowerCase == "i" => "1" :: Nil
				case s if s.toLowerCase == "b" => "8" :: Nil
				case s if s.toLowerCase == "g" => "6" :: Nil
				case s if s.toLowerCase == "t" => "7" :: Nil
				case s if s.toLowerCase == "a" => "4" :: "@" :: Nil
				case _ => Nil
			}) ::: c.toLowerCase :: c.toUpperCase :: Nil).view
	}
}
