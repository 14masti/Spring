<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Doctor Profiles</title>
    <style>
        body {
            font-family: Arial, sans-serif;
			background-color:grey;
            margin: 5%;
            padding: 0;
        }
        .container {
            display: flex; /* Use flex display for horizontal layout */
            flex-wrap: wrap;
            justify-content: space-around; /* Adjust as needed */
            align-items: flex-start;
            padding: 20px;
        }
        .doctor-card {
            width: 100%;
            margin: 20px;
            padding: 15px;
            border: 1px solid #ddd;
            text-align: center;
        }
        .doctor-img {
        width: 150px; /* Set a fixed width */
        height: 150px; /* Set a fixed height */
        object-fit: cover; /* Maintain aspect ratio */
        border-radius: 50%;
        margin-bottom: 10px;
    }
        .doctor-name {
            font-weight: bold;
        }
        .doctor-qualification {
            color: black;
			
        }
        .button-container {
            margin-top: 10px;
        }
        .profile-button {
            background-color: #007bff;
            color: #fff;
            padding: 5px 10px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
</head>
<body>
  <h1>Welcome!</h1>
  <h4>DOCTORS IN OUR HOSPITAL</H4>
    <div class="container">
		 <form action="homeform" method="GET">
        <div class="doctor-card">
            <img src="https://t3.ftcdn.net/jpg/02/95/51/80/360_F_295518052_aO5d9CqRhPnjlNDTRDjKLZHNftqfsxzI.jpg" alt="Dr. Jane Doe" class="doctor-img">
            <div class="doctor-name">Dr. Jane Doe</div>
            <div class="doctor-qualification">MD Neurology</div>
            <div class="button-container">
                <button type="submit" class="profile-button" onclick="redirectToProfile(2)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://thumbs.dreamstime.com/b/male-doctor-arms-folded-cheerful-young-56745126.jpg" alt="Dr. Michael Johnson" class="doctor-img">
            <div class="doctor-name">Dr. Michael Johnson</div>
            <div class="doctor-qualification">MD Orthopedics</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(3)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://images.unsplash.com/photo-1612363584451-cd060fb62018?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fG1hbGUlMjBkb2N0b3J8ZW58MHx8MHx8fDA%3D&w=1000&q=80" alt="Dr. David Brown" class="doctor-img">
            <div class="doctor-name">Dr. David Brown</div>
            <div class="doctor-qualification">MD Dermatology</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(5)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://media.istockphoto.com/id/1200980392/photo/medical-concept-of-asian-beautiful-female-doctor-in-white-coat-with-stethoscope-waist-up.jpg?s=612x612&w=0&k=20&c=nD_1Tn11kWcMZwZfnyA-lYAvNKcBeoEK_KLObBnN6Jg=" alt="Dr. Sarah Johnson" class="doctor-img">
            <div class="doctor-name">Dr. Sarah Johnson</div>
            <div class="doctor-qualification">MD Gynecology</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(6)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://wallpaperaccess.com/full/5182840.jpg" alt="Dr. Mark Anderson" class="doctor-img">
            <div class="doctor-name">Dr. Mark Anderson</div>
            <div class="doctor-qualification">MD Pediatrics</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(7)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://cdn.xxl.thumbs.canstockphoto.com/medical-doctor-woman-medical-physician-doctor-woman-over-blue-clinic-background-pictures_csp26825884.jpg" alt="Dr. Jessica White" class="doctor-img">
            <div class="doctor-name">Dr. Jessica White</div>
            <div class="doctor-qualification">DDS Dentistry</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(8)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://media.istockphoto.com/id/1327024466/photo/portrait-of-male-doctor-in-white-coat-and-stethoscope-standing-in-clinic-hall.jpg?s=612x612&w=0&k=20&c=49wqOwwuonk9f8NACL7M_5RosqQPFwJ8-dpmeo9AvQw=" alt="Dr. Brian Miller" class="doctor-img">
            <div class="doctor-name">Dr. Brian Miller</div>
            <div class="doctor-qualification">MD ENT</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(9)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://media.istockphoto.com/id/481207848/photo/smiling-female-doctor.jpg?s=170667a&w=0&k=20&c=nZkCxlYy-vH2p32epVClfOqnlf8BEq3tNPRhqdl4tQY=" alt="Dr. Samantha Brown" class="doctor-img">
            <div class="doctor-name">Dr. Samantha Brown</div>
            <div class="doctor-qualification">MD Internal Medicine</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(10)">View Profile</button>
            </div>
        </div>

         <div class="doctor-card">
            <img src="https://media.istockphoto.com/id/1161336374/photo/portrait-of-confident-young-medical-doctor-on-blue-background.jpg?s=170667a&w=0&k=20&c=QNdbf-dH5341WZXyhAYJJC-NjM-ur6oKt1gS5vG5ALc=" alt="Dr. Emil" class="doctor-img">
            <div class="doctor-name">Dr. Emil</div>
            <div class="doctor-qualification">MD Ophthalmology</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(4)">View Profile</button>
            </div>
        </div>

        <div class="doctor-card">
            <img src="https://img.freepik.com/free-photo/doctor-with-his-arms-crossed-white-background_1368-5790.jpg?w=2000" alt="Dr. John Smith" class="doctor-img">
            <div class="doctor-name">Dr. John Smith</div>
            <div class="doctor-qualification">MD Cardiology</div>
            <div class="button-container">
                <button class="profile-button" onclick="redirectToProfile(1)">View Profile</button>
            </div>
        </div>
        </form>
    </div>

    <script>
        function redirectToProfile(doctorId) {
            window.location.href = `profile.html?id=${doctorId}`;
        }
    </script>
</body>
</html>
