import org.scalatest.flatspec._
import org.scalatest.matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Room"
  it should "print information if number of people who wants to enter the room is bigger then capacity" in {
    val pplEntering = 23
    val capacity = 20
    val room = Room("Just a Room", capacity)
    val actual = room.enter(pplEntering)
    val expected = println("not enough space")
    actual shouldBe expected
  }
  it should "return number of ppl who entered the room" in {
  val secondRoom = Room("Second Room", 15)
  val pplEntering = 10
  val actual = secondRoom.enter(pplEntering)
    val expeced = pplEntering
    actual shouldBe expeced
  }
}