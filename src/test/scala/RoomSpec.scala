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
  it should "return  information with number of people who wants to entered the room in" {
    val pplEntering = 10
    val capacity = 20
    val room2 = Room("Second room", capacity)
    val actual = room2.enter(pplEntering)
    val expected = room2
    actual shouldBe expected
  }

}

