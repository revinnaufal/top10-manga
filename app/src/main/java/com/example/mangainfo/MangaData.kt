package com.example.mangainfo

object MangaData {
    private val manganame = arrayOf("One Piece","Berserk","Naruto","Shingeki No Kyojin","Bleach","Tokyo Ghoul",
        "Death Note","Full Metal Alchemist","Fairy Tail","Oyasumi Punpun","One Punch Man","Boku No Hero Academia",
        "Koe No Katachi","Kuroshitsuji","Hunter X Hunter")

    private val mangasinopsis = arrayOf("Gol D. Roger, a man referred to as the \"Pirate King,\" is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the Pirate King is executed and the Great Age of Pirates begins.\n" +
                "\n" +
                "Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new Pirate King. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.\n"
                ,"Guts, a former mercenary now known as the \"Black Swordsman,\" is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings.\n" +
                "\n" +
                "Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity.",
        "Whenever Naruto Uzumaki proclaims that he will someday become the Hokage—a title bestowed upon the best ninja in the Village Hidden in the Leaves—no one takes him seriously. Since birth, Naruto has been shunned and ridiculed by his fellow villagers. But their contempt isn't because Naruto is loud-mouthed, mischievous, or because of his ineptitude in the ninja arts, but because there is a demon inside him. Prior to Naruto's birth, the powerful and deadly Nine-Tailed Fox attacked the village. In order to stop the rampage, the Fourth Hokage sacrificed his life to seal the demon inside the body of the newborn Naruto.\n" +
                "\n" +
                "And so when he is assigned to Team 7—along with his new teammates Sasuke Uchiha and Sakura Haruno, under the mentorship of veteran ninja Kakashi Hatake—Naruto is forced to work together with other people for the first time in his life. Through undergoing vigorous training and taking on challenging missions, Naruto must learn what it means to work in a team and carve his own route toward becoming a full-fledged ninja recognized by his village.\n" +
                "\n" +
                "[Written by MAL Rewrite]",
        "Hundreds of years ago, horrifying creatures which resembled humans appeared. These mindless, towering giants, called \"titans,\" proved to be an existential threat, as they preyed on whatever humans they could find in order to satisfy a seemingly unending appetite. Unable to effectively combat the titans, mankind was forced to barricade themselves within large walls surrounding what may very well be humanity's last safe haven in the world.\n" +
                "\n" +
                "In the present day, life within the walls has finally found peace, since the residents have not dealt with titans for many years. Eren Yeager, Mikasa Ackerman, and Armin Arlert are three young children who dream of experiencing all that the world has to offer, having grown up hearing stories of the wonders beyond the walls. But when the state of tranquility is suddenly shattered by the attack of a massive 60-meter titan, they quickly learn just how cruel the world can be. On that day, Eren makes a promise to himself that he will do whatever it takes to eradicate every single titan off the face of the Earth, with the hope that one day, humanity will once again be able to live outside the walls without fear."
        ,"For as long as he can remember, high school student Ichigo Kurosaki has been able to see the spirits of the dead, but that has not stopped him from leading an ordinary life. One day, Ichigo returns home to find an intruder in his room who introduces herself as Rukia Kuchiki, a Soul Reaper tasked with helping souls pass over. Suddenly, the two are jolted from their conversation when a Hollow—an evil spirit known for consuming souls—attacks. As Ichigo makes a brash attempt to stop the Hollow, Rukia steps in and shields him from a counterattack. Injured and unable to keep fighting, Rukia suggests a risky plan—transfer half of her Soul Reaper powers to Ichigo. He accepts and, to Rukia's surprise, ends up absorbing her powers entirely, allowing him to easily dispatch the Hollow.\n" +
                "\n" +
                "Now a Soul Reaper himself, Ichigo must take up Rukia's duties of exterminating Hollows and protecting spirits, both living and dead. Along with his friends Orihime Inoue and Yasutora Sado—who later discover spiritual abilities of their own—Ichigo soon learns that the consequences of becoming a Soul Reaper and dealing with the world of spirits are far greater than he ever imagined."
        ,"Lurking within the shadows of Tokyo are frightening beings known as \"ghouls,\" who satisfy their hunger by feeding on humans once night falls. An organization known as the Commission of Counter Ghoul (CCG) has been established in response to the constant attacks on citizens and as a means of purging these creatures. However, the problem lies in identifying ghouls as they disguise themselves as humans, living amongst the masses so that hunting prey will be easier. Ken Kaneki, an unsuspecting university freshman, finds himself caught in a world between humans and ghouls when his date turns out to be a ghoul after his flesh.\n" +
                "\n" +
                "Barely surviving this encounter after being taken to a hospital, he discovers that he has turned into a half-ghoul as a result of the surgery he received. Unable to satisfy his intense craving for human meat through conventional means, Kaneki is taken in by friendly ghouls who run a coffee shop in order to help him with his transition. As he begins what he thinks will be a peaceful new life, little does he know that he is about to find himself at the center of a war between his new comrades and the forces of the CCG, and that his new existence has caught the attention of ghouls all over Tokyo."
        ,"A shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm.\n" +
                "\n" +
                "High school student and prodigy Light Yagami stumbles upon the Death Note and—since he deplores the state of the world—tests the deadly notebook by writing a criminal's name in it. When the criminal dies immediately following his experiment with the Death Note, Light is greatly surprised and quickly recognizes how devastating the power that has fallen into his hands could be.\n" +
                "\n" +
                "With this divine capability, Light decides to extinguish all criminals in order to build a new world where crime does not exist and people worship him as a god. Police, however, quickly discover that a serial killer is targeting criminals and, consequently, try to apprehend the culprit. To do this, the Japanese investigators count on the assistance of the best detective in the world: a young and eccentric man known only by the name of L."
        ,"Alchemists are knowledgeable and naturally talented individuals who can manipulate and modify matter due to their art. Yet despite the wide range of possibilities, alchemy is not as all-powerful as most would believe. Human transmutation is strictly forbidden, and whoever attempts it risks severe consequences. Even so, siblings Edward and Alphonse Elric decide to ignore this great taboo and bring their mother back to life. Unfortunately, not only do they fail in resurrecting her, they also pay an extremely high price for their arrogance: Edward loses his left leg and Alphonse his entire body. Furthermore, Edward also gives up his right arm in order to seal his brother's soul into a suit of armor.\n" +
                "\n" +
                "Years later, the young alchemists travel across the country looking for the Philosopher's Stone, in the hopes of recovering their old bodies with its power. However, their quest for the fated stone also leads them to unravel far darker secrets than they could ever imagine."
        ,"In the mystical realm of Earth Land, magic exists at the core of everyday life for its inhabitants, from transportation to utilities and everything in between. However, even with all its benefits, magic can also be used for great evil; therefore, to prevent dark forces from upsetting the natural order of things, there exists a system of magical guilds in the Kingdom of Fiore. Under the command of their respective guild masters, these guilds are made up of witches and wizards who take on various job requests to earn fame and fortune. One particular guild stands high above the rest in both strength and spirit, and its name is Fairy Tail.\n" +
                "\n" +
                "In his quest to find his dragon foster father—Igneel—Natsu Dragneel, a fiery and reckless mage, and his partner Happy run into a young celestial mage by the name of Lucy Heartfilia, who reveals that it's her dream to become a full-fledged wizard and join the Fairy Tail guild. After rescuing her from an abduction attempt, Natsu offers her a home in Fairy Tail. Now a member of the guild, Lucy teams up with Natsu and befriends fellow wizards Gray Fullbuster and Erza \"Titania\" Scarlet. Together, this motley crew set out on their many adventures, gaining many faithful allies and deadly foes along the way."
        ,"Punpun Onodera is a normal 11-year-old boy living in Japan. Hopelessly idealistic and romantic, Punpun begins to see his life take a subtle—though nonetheless startling—turn to the adult when he meets the new girl in his class, Aiko Tanaka. It is then that the quiet boy learns just how fickle maintaining a relationship can be, and the surmounting difficulties of transitioning from a naïve boyhood to a convoluted adulthood. When his father assaults his mother one night, Punpun realizes another thing: those whom he looked up to were not as impressive as he once thought.\n" +
                "\n" +
                "As his problems increase, Punpun's once shy demeanor turns into voluntary reclusiveness. Rather than curing him of his problems and conflicting emotions, this merely intensifies them, sending him down the dark path of maturity in this grim coming-of-age saga."
        ,"After rigorously training for three years, the ordinary Saitama has gained immense strength which allows him to take out anyone and anything with just one punch. He decides to put his new skill to good use by becoming a hero. However, he quickly becomes bored with easily defeating monsters, and wants someone to give him a challenge to bring back the spark of being a hero.\n" +
                "\n" +
                "Upon bearing witness to Saitama's amazing power, Genos, a cyborg, is determined to become Saitama's apprentice. During this time, Saitama realizes he is neither getting the recognition that he deserves nor known by the people due to him not being a part of the Hero Association. Wanting to boost his reputation, Saitama decides to have Genos register with him, in exchange for taking him in as a pupil. Together, the two begin working their way up toward becoming true heroes, hoping to find strong enemies and earn respect in the process."
        ,"One day, a four-year-old boy came to a sudden realization: the world is not fair. Eighty percent of the world's population wield special abilities, known as \"quirks,\" which have given many the power to make their childhood dreams of becoming a superhero a reality. Unfortunately, Izuku Midoriya was one of the few born without a quirk, suffering from discrimination because of it. Yet, he refuses to give up on his dream of becoming a hero; determined to do the impossible, Izuku sets his sights on the elite hero training academy, UA High.\n" +
                "\n" +
                "However, everything changes after a chance meeting with the number one hero and Izuku's idol, All Might. Discovering that his dream is not a dead end, the powerless boy undergoes special training, working harder than ever before. Eventually, this leads to him inheriting All Might's power, and with his newfound abilities, gets into his school of choice, beginning his grueling journey to become the successor of the best hero on the planet."
        ,"Shouya Ishida, a boy always looking for ways to beat boredom, ends up looking for it in the wrong place. Weirded out by his new classmate, a deaf transfer student named Shouko Nishimiya, he deems her as the target of his ostracizing and bullying. Day after day, Shouya picks on Shouko, unaware of the effects of his thoughtless actions. He finally understands the pain he has inflicted on her when one day, his bullying culminates in her leaving the school, and his classmates begin to shun and harass him every chance they get instead. Determined to right his wrongs, five years later, Shouya, now a third year high school loner, meets Shouko again. Thus begins the story of a young man's path to redemption."
        ,"Tucked away in the English countryside lies the ominous manor of the Phantomhives, a family which has established itself as the cold and ruthless \"Queen's Watchdog\" as well as the head of London's criminal underground. After a tragedy leaves the Earl and his wife dead, many are shocked when their son, a young boy named Ciel, claims his place as the new Earl of the Phantomhive house. At first, many perceive him only as a child surrounded by a few eccentric servants. But they soon begin to realize that it is foolish to meddle with Ciel and his demonic butler Sebastian.\n" +
                "\n" +
                "Taking place at the end of the 19th century, Kuroshitsuji follows these two as they face countless mysteries and dangers that plague England and threaten the Queen, uncovering the truth about what really happened to Ciel's parents in the process."
        ,"Hunters are a special breed, dedicated to tracking down treasures, magical beasts, and even other men. But such pursuits require a license, and less than one in a hundred thousand can pass the grueling qualification exam. Those who do pass gain access to restricted areas, amazing stores of information, and the right to call themselves Hunters. "



        )
    private val picturelink = arrayOf("https://img1.ak.crunchyroll.com/i/spire4/8056a82e973dde98ebb82abd39dc69731564519729_main.jpg",
        "https://cdn.myanimelist.net/images/manga/1/157931.jpg",
        "https://cdn.myanimelist.net/images/manga/3/117681.jpg",
        "https://cdn.myanimelist.net/images/manga/2/37846.jpg",
        "https://cdn.myanimelist.net/images/manga/2/180089.jpg",
        "https://cdn.myanimelist.net/images/manga/3/114037.jpg",
        "https://cdn.myanimelist.net/images/manga/2/54453.jpg",
        "https://cdn.myanimelist.net/images/manga/1/27600.jpg",
        "https://cdn.myanimelist.net/images/manga/3/198604.jpg",
        "https://cdn.myanimelist.net/images/manga/3/164420.jpg",
        "https://fadmagazine.com/wp-content/uploads/OPM2_KeyVisual.gif",
        "https://cdn.myanimelist.net/images/manga/1/209370.jpg",
        "https://cdn.myanimelist.net/images/manga/1/120529.jpg",
        "https://cdn.myanimelist.net/images/manga/1/28128.jpg",
        "https://cdn.myanimelist.net/images/manga/2/192445.jpg"
        )

    private val Namaauthor = arrayOf("Eichiiro Oda","Kentaro Miura","Masashi Kishimoto","Hajime Isiyama","Tite Kubo",
        "Sui Ishida","Takeshi Obata","Arakawa Hiromu","Hiro Mashima","Inio Asano","Yusuke Murata","Kouhei Hirokishi",
        "Yoshitoki Ooima","Yana Toboso","Yoshihiro Togashi")


    private val PhotoAuthor = arrayOf("https://satupiece.files.wordpress.com/2015/10/top-30-mangaka-terfavorit-2015-versi-charapedia-eiichiro-oda.jpg?w=225",
        "https://upload.wikimedia.org/wikipedia/commons/b/b2/Kentaro_Miura.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/2/42365.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/1/40147.jpg",
        "https://www.liveabout.com/thmb/9VxwdxsGlx5b1kYU0ZzSnOp9fwQ=/365x500/filters:fill(auto,1)/TiteKubo1_500-56a5e16a5f9b58b7d0dee752.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/3/37277.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/2/39958.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/2/37555.jpg",
        "http://pm1.narvii.com/6051/41979d613b69df071e477839a49511e3fed96d11_00.jpg",
        "https://images.gr-assets.com/authors/1251221178p8/685523.jpg",
        "https://vignette.wikia.nocookie.net/onepunchman/images/3/32/Yusuke_Murata.png/revision/latest?cb=20190817041230",
        "https://cdn.myanimelist.net/images/voiceactors/2/19467.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/3/30393.jpg",
        "https://cdn.myanimelist.net/images/voiceactors/1/7161.jpg",
        "https://pbs.twimg.com/media/DbzBjzhU8AASsYi.jpg")

    private val Reviews = arrayOf("9.07","9.30","8.10","8.54","7.70","8.60","8.75","9.10","7.80","9.00","8.10","8.52",
        "8.85","8.53","8.67")

    val listData : ArrayList<Manga>
        get() {
            val list = arrayListOf<Manga>()
            for (position in manganame.indices) {
                val manga = Manga()
                manga.MangaName = manganame[position]
                manga.MangaSinopsis = mangasinopsis[position]
                manga.photo = picturelink[position]
                manga.photoAuthor = PhotoAuthor[position]
                manga.NamaAuthor = Namaauthor[position]
                manga.Rating = Reviews[position]
                list.add(manga)
            }
            return list
        }
}