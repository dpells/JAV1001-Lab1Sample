fun main(){
  /* print("Enter your numeric grade: ")
  var numericGrade = readln().toInt()
  print("Enter your Name: ")
  var firstName = readln() */
  print("Enter your grade and name separated by a space: ")
  var (stringGrade, firstName) = readln().split(' ')
  var numericGrade = stringGrade.toInt()

  when(numericGrade){
    in 80..100 -> println(firstName + " achieved A.")
    in 70..80 -> println(firstName + " achieved B.")
    in 60..70 -> println(firstName + " achieved C.")
    in 50..60 -> println(firstName + " achieved D.")
    in 0..50 -> println(firstName + " achieved F.")
    else -> println(numericGrade.toString() + " is not valid. Please enter 0-100.\nExiting")
  }
}
