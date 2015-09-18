import java.io.{File, BufferedWriter, OutputStreamWriter, FileOutputStream}

/**
 * Created by martin on 18/09/15.
 */
object MyApp extends App{
	override def main(args:Array[String]): Unit ={
		val file = new File("/home/martin/test.txt")
		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))
		Leeter.leet("boobies!").foreach(x=>writer.write(s"$x\n"))
		writer.close()
	}
}
