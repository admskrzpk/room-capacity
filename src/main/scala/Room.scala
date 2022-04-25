case class Room(roomName: String, capacity: Int, var occupied: Int) {

  def enter(pplEntering: Int) = {
    if (pplEntering + occupied > capacity) println("not enough space")
    else pplEntering + occupied
  }

  def leave(pplLeaving: Int) = occupied - pplLeaving

  def report(pplInside: Int) = println(s"there is $pplInside people inside a room $roomName")
}

object Room extends App {
  val firstRoom = Room("First Room", 20, 0)
}