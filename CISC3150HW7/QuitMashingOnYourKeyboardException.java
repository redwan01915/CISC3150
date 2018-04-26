public class QuitMashingOnYourKeyboardException extends IllegalArgumentException {

private String messageContent;

public QuitMashingOnYourKeyboardException(){

System.out.println("An Illegal operation was performed.");

}

public QuitMashingOnYourKeyboardException(String messageContent){

System.out.println("An Illegal operation was performed.");

this.messageContent = messageContent;

}

public String toString(){

String string = new String();

string += messageContent;

return string;

}

}


