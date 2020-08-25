namespace java thrift.genenrated

typedef i16 short
typedef i32 int
typedef i64 long
typedef string String
typedef bool boolean

struct Person{
    1:optional String name,
    2:optional int age,
    3:optional bool married
}
exception DataException{
    1:optional String message,
    2:optional String callStack,
    3:optional String info
}
service PersonService{
    Person getPerson(1:required String name) throws (1: DataException e),
    void setPerson(1:required Person person) throws (1: DataException e)
}

