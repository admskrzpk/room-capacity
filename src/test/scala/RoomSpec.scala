import org.scalatest.flatspec._
import org.scalatest.matchers._

class RoomSpec extends AnyFlatSpec with should.Matchers {
  behavior of "Room"
  it should "return false if number of people who wants to enter the room is bigger then capacity and current occupancy" in {
    val pplEntering = 23
    val capacity = 20
    val room = Room("Just a Room", capacity)
    val actual = room.enter(pplEntering)
    val expected = false
    actual shouldBe expected
  }
  it should "return true if number of people who wants to enter the room is lower or equal then capacity and current occupancy" in {
  val secondRoom = Room("Second Room", 15)
  val pplEntering = 10
  val actual = secondRoom.enter(pplEntering)
    val expected = true
    actual shouldBe expected
  }

  it should "return number of people leaving a room" in {
    val thirdRoom = Room("Third Room", 20)
    val pplLeaving = 10
    val actual = thirdRoom.enter(pplLeaving)
    val expected = true
    actual shouldBe expected
  }


}