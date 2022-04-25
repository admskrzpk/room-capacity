case class Room(roomName: String, capacity: Int) {
  var occupied = 0

  def enter(pplEntering: Int): Boolean = {
    if (pplEntering + occupied > capacity) return false
    else
      occupied += pplEntering
    true
  }

  def leave(pplLeaving: Int): Boolean = {
    if (occupied - pplLeaving < 0) false
    else {
      occupied -= pplLeaving
      true
    }
  }

  def report(pplInside: Int): Unit = println(s"In $roomName there is $occupied people")

}

//klasa people

object Room extends App {
}