package islom.din.myapplication.model


sealed class Users {

    class User1(
        var messange: String

    ) : Users()

    class User11(

        var messangeImg: Int
    ) : Users()

    class User2(
        var messange2: String,

        ) : Users()

    class User22(
        var messangeImg2: Int
    ) : Users()
}