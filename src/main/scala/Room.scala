case class Room (roomName: String, capacity: Int, var occupied: Int) {

def enter(pplEntering: Int) = {
  if (pplEntering + occupied > capacity) println("not enough space")
  else pplEntering + occupied
}
  def leave(pplLeaving: Int) = occupied - pplLeaving
  def report(pplInside:Int) = println(s"there is $pplInside people inside a room $roomName")

}

object Room extends App {
  val firstRoom = Room("First Room", 20, 0)
}


//Define a Room class that should do the following:
//
//A room has a name and capacity
//capacity = the maximum number of people that can enter a room
//A person can enter a room (only when there is still free space)
//A person can leave a room
//A room can report the number of people inside (who entered)