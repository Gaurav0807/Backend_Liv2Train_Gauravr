# Backend_Liv2Train_Gauravr
BackEnd test

# 1.)first Install mysql database in your computer.
# 2.) Install STS(Spring Tool Suite) or Eclipse or Intellij any IDE
# 3.) Then import this project in your IDE.

# After this in application.properties change username and password and enter your username and password of MySQL Connector.
# then check these api by entering this url :
# 1.) Post to save data in database. url:- http://localhost:8080/train
#  then enter this data in JSON Format 
  #
  {
    "id": 4,
    "centerName": "Gaurav rawat",
    "centerCode": "919899675248",
    "a": [
        {
            
            "city": "faridabad",
            "state": "Haryana",
            "pincode": 121004,
            "detailedAddress": "sector55"
        }
    ],
    "studentCapacity": 20,
    "course": [
        {
            
            "cname": "English"
        }
    ],
   
    "email": "gauravrawat@gmail.com",
    "mobileNo": "9899675248"
}

#

# 2.) API to get all name url :- http://localhost:8080/name
