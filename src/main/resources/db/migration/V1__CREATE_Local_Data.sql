CREATE TABLE User(
    id PRIMARY KEY,
    username VARCHAR (255),
    email VARCHAR(255),
    password VARCHAR(255)
);
CREATE TABLE Parrain(
    entreprise VARCHAR(255),
    user_id INT
);
CREATE TABLE Porteur(
    user_id INT,
);
CREATE TABLE Message(
    id PRIMARY KEY
);
CREATE TABLE Admin(
    User_id INT
);

