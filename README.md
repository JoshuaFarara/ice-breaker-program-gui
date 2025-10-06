# Ice Breaker Program GUI  
*A Java Desktop Application for Interactive Team Building*

---

## Overview  
The **Ice Breaker Program GUI** is a desktop application built with **Java** that provides a set of engaging activities to help teams connect and communicate more effectively.  
It features a **graphical user interface (GUI)** that allows users to select, configure, and run icebreaker games, making it suitable for classrooms, workshops, and team meetings.

---

### Features  

- Multiple icebreaker games suitable for various group sizes and contexts.  
- Intuitive graphical user interface designed using Java Swing.  
- Customizable settings for rules, participants, and parameters.  
- Local data persistence to save preferences and configurations.  
- Modular design that allows new games to be added easily.  

---

### Technologies Used  

| Category | Tools / Libraries |
|-----------|------------------|
| Language | Java |
| GUI Toolkit | JavaFX |
| Build Tool | Apache Maven |
| IDE | Eclipse (or any compatible Java IDE) |
| Version Control | Git / GitHub |

---

### Project Structure  
```
ice-breaker-program-gui/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/icebreaker/
│   │           ├── Main.java            # Entry point
│   │           ├── gui/                 # GUI components (frames, panels)
│   │           ├── games/               # Individual game logic
│   │           └── utils/               # Helper classes and constants
│   └── test/
│       └── java/                        # Unit tests
│
├── pom.xml                              # Maven build configuration
├── README.md                            # Project documentation
└── .gitignore
```

### Getting Started
1. Clone the Repository<br>
   git clone https://github.com/JoshuaFarara/ice-breaker-program-gui.git<br>
   cd ice-breaker-program-gui<br>
2. Build the Project<br>
  Ensure Maven and Java 24 are installed, then run:<br>
  mvn clean install<br>
3. Run the Application<br>
  Using Eclipse:<br>
  Right-click the project → Run As → Java Application<br>
  Select the main class: com.icebreaker.Main<br>

### Design Notes

- Architecture: Follows a Model-View-Controller (MVC) design to separate logic, UI, and data management.
- Event-Driven Programming: Utilizes Java’s event listeners to handle user interactions and manage game flow.
- Extensibility: New games can be added by implementing the Game interface and registering it within the application.

### Future Enhancements

- Implement a settings panel for customization of timers, themes, and difficulty levels.
- Add leaderboard tracking and player statistics.
- Introduce multiplayer functionality via network sockets.
- Enhanced User Interface: Implementing a more modern and responsive design.
- Additional Games: Expanding the selection of icebreaker games.
- Online Multiplayer Support: Enabling remote teams to participate in games.
- Cloud Integration: Allowing for data synchronization across devices.
- Package the application as an executable .jar or installer for easy distribution.

Author
Joshua Farara
