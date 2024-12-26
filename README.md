# Educational Game Platform project
## E/R Diagram of the database

![ER_diagram](https://github.com/user-attachments/assets/a28a2e67-9bc4-4259-b1f7-62302edf5841)

### Tables:
- User - contains id, username, email and hashed password of the user
- UserRole - contains id and title of the role
- UserDetails - contains id, name, family and photo of the user
- Subject - contains id and title of the subject
- Game - contains id, harnessLevel (1 for easy, 2 for medium, 3 for hard and so on) and maxScore of the game
- UsersGames (plays) - uid (user id) and gid (game id) that represents the connection between the user and the game that this user have played
- Quiz extends Game - contains all that Game contains plus questions list of the quiz
- Question - contains id, questionText and score of the question
- Answer - contains id, answerText and status (0 for possible and 1 for correct answer) of the answer
- QusetionPossibleAnswers (has a possible) - contains qid (question id) and aid (andswer id) that represents the connection between the question and the possible answers of this question
- QuestionCorrectAnswers (has a correct) - contains qid (question id) and aid (answer id) that represents the connection between the question and thecorrect answers of this question
