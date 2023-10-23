package com.example.chatbotui.data

import com.example.chatbotui.R
import com.example.chatbotui.model.Texts
import com.example.chatbotui.model.User

class DataSource {

    fun users():List<User>{
        return listOf(
            User(R.drawable._image,R.string.name1),
            User(R.drawable._image2,R.string.name2),
            User(R.drawable._image3,R.string.name3),
            User(R.drawable._image4,R.string.name17),
            User(R.drawable._image5,R.string.name18),
            User(R.drawable._image6,R.string.name19),
            User(R.drawable._image7,R.string.name4),
            User(R.drawable.avatar,R.string.name5),
            User(R.drawable.avatar1,R.string.name6),
            User(R.drawable.avatar2,R.string.name7),
            User(R.drawable.avatar3,R.string.name8),
            User(R.drawable.avatar5,R.string.name9),
            User(R.drawable.avatar6,R.string.name10),
            User(R.drawable.avatarp,R.string.name12),
            User(R.drawable.ellipse_304,R.string.name11),
            User(R.drawable.ellipse_307,R.string.name13),
            User(R.drawable.group_13,R.string.name14),
            User(R.drawable.group_17,R.string.name15),
            User(R.drawable.rectangle_1092,R.string.name16),
            User(R.drawable.rectangle_1093,R.string.name20),
            User(R.drawable.rectangle_1094,R.string.name21),
        )

    }


    fun userMessages():List<Texts>{
        return listOf(
            Texts(R.drawable._image,R.string.name1,"Hey! where have you been all day?"),
            Texts(R.drawable._image2,R.string.name2,"Good day its been a while"),
            Texts(R.drawable._image3,R.string.name3,"Hello please check your email"),
            Texts(R.drawable._image4,R.string.name17,"Yes i made my nails yesterday"),
            Texts(R.drawable._image5,R.string.name18,"Wow they look beautiful"),
            Texts(R.drawable._image6,R.string.name19,"Maybe i don't know"),
            Texts(R.drawable._image7,R.string.name4,"You don't even wanna know the story is really funny okay i think i'll start from when we met in January"),
            Texts(R.drawable.avatar,R.string.name5,"Okay well maybe its because thats not your profile link"),
            Texts(R.drawable.avatar1,R.string.name6,"A lot to say i don't even know where to start"),
            Texts(R.drawable.avatar2,R.string.name7,"It's a very big city you must see it it's really beautiful too "),
            Texts(R.drawable.avatar3,R.string.name8,"You never really know until you at least give it a try thats what they always say"),
            Texts(R.drawable.avatar5,R.string.name9,"Check out the link i sent i've been trying to fix it but its not working"),
            Texts(R.drawable.avatar6,R.string.name10,"So i just sent all of them to joan"),
            Texts(R.drawable.avatarp,R.string.name12,"How about next week?"),
            Texts(R.drawable.ellipse_304,R.string.name11,"i'll think about it okay"),
            Texts(R.drawable.ellipse_307,R.string.name13,"okay"),
            Texts(R.drawable.group_13,R.string.name14,"Congarulations!!!!"),
            Texts(R.drawable.group_17,R.string.name15,"Awwwwn thats awsome"),
            Texts(R.drawable.rectangle_1092,R.string.name16,"Depends on the budget really"),
            Texts(R.drawable.rectangle_1093,R.string.name20,"The more the merrier"),
            Texts(R.drawable.rectangle_1094,R.string.name21,"I'll send it right now"),
        )
    }



}