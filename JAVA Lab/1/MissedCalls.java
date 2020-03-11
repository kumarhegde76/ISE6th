
class MissedCalls{
    String name;
    long number;
    String time;

    MissedCalls(String name, long number, String time){
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public String toString(){
        return "Name:"+name+"\nPhone Number:"+number+"\nTime:"+time;
    }
}