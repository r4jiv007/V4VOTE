-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 01, 2014 at 04:34 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vote`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidates`
--

CREATE TABLE IF NOT EXISTS `candidates` (
  `state` varchar(30) DEFAULT NULL,
  `const` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `party` varchar(8) DEFAULT NULL,
  `ratings` int(4) NOT NULL,
  `path` varchar(100) NOT NULL,
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `num` int(5) NOT NULL,
  `women` int(4) NOT NULL,
  `education` int(4) NOT NULL,
  `health` int(4) NOT NULL,
  `corruption` int(4) NOT NULL,
  `technology` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=176 ;

--
-- Dumping data for table `candidates`
--

INSERT INTO `candidates` (`state`, `const`, `name`, `party`, `ratings`, `path`, `id`, `num`, `women`, `education`, `health`, `corruption`, `technology`) VALUES
('Karnataka', 'Bangalore', 'CHANDER KUMAR', 'Congress', 4, 'http://192.168.43.42/vote/images/01.png', 1, 2, 5, 3, 5, 4, 2),
('Karnataka', 'Bangalore', 'SMT PRAT1BHA SINGH', 'AAP', 3, 'http://192.168.43.42/vote/images/02.png', 2, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore', 'MOHAN LAL BRAGTA', 'BJP', 4, 'http://192.168.43.42/vote/images/03.png', 3, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore', 'SUBOIDH KANT SAKAI', 'NA', 3, 'http://192.168.43.42/vote/images/04.png', 4, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Vellore', 'PRAKASH B. HUKKERI', 'Congress', 0, 'http://192.168.43.42/vote/images/05.png', 5, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Vellore', 'SMT, LAKSHMI HEBBALKAR', 'AAP', 0, 'http://192.168.43.42/vote/images/06.png', 6, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Vellore', 'AJAY KUMAR SARNAIK', 'BJP', 0, 'http://192.168.43.42/vote/images/02.png', 7, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Vellore', 'B.V. NAIK', 'NA', 0, 'http://192.168.43.42/vote/images/01.png', 8, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Hyderabad', 'I3ASAVARAJ HITNAL', 'Congress', 0, 'http://192.168.43.42/vote/images/03.png', 9, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Hyderabad', 'MANJUNATH BHANDARY', 'BJP', 0, 'http://192.168.43.42/vote/images/04.png', 10, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Hyderabad', 'JANARDANA POOJARY', 'AAP', 0, 'http://192.168.43.42/vote/images/05.png', 11, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Hyderabad', 'CHANDRAPPA', 'NA', 0, 'http://192.168.43.42/vote/images/06.png', 12, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Sinius', 'RIZWAN ARSHAD', 'Congress', 0, '', 13, 0, 0, 0, 0, 0, 0),
('Karnataka', 'CHIKKBALLAPUR', 'DR. M. VEERAPPA MOLY', 'Congress', 0, '', 14, 0, 0, 0, 0, 0, 0),
('Kerala', 'KASARAGOD', 'T SIDDIQUE', 'Congress', 0, '', 15, 0, 0, 0, 0, 0, 0),
('Kerala', 'KANNUR', 'K. SUDHAKARAN', 'Congress', 0, '', 16, 0, 0, 0, 0, 0, 0),
('Kerala', 'VADAKARA', 'MULLAPPALLY RAMACHANDRAN ''', 'Congress', 0, '', 17, 0, 0, 0, 0, 0, 0),
('Kerala', 'WAYANAD', 'M.I. SHANAVAS', 'Congress', 0, '', 18, 0, 0, 0, 0, 0, 0),
('Kerala', '0021-11KODE', 'M.K. RAGHAVAN', 'Congress', 0, '', 19, 0, 0, 0, 0, 0, 0),
('Kerala', 'ALATHUR - SC', 'SMT, SHEEBA KA.', 'Congress', 0, '', 20, 0, 0, 0, 0, 0, 0),
('Kerala', 'THRISSUR', 'K.P. DHANAPALAN', 'Congress', 0, '', 21, 0, 0, 0, 0, 0, 0),
('Kerala', 'CHALAKUDY', 'P.C. CHACKO', 'Congress', 0, '', 22, 0, 0, 0, 0, 0, 0),
('Kerala', 'ERNAKULAM', 'PROF. K.V. THOMAS', 'Congress', 0, '', 23, 0, 0, 0, 0, 0, 0),
('Kerala', 'IDUKKI', 'DEAN KURIAKOSE', 'Congress', 0, '', 24, 0, 0, 0, 0, 0, 0),
('Kerala', 'MAVELIKKARA - Sc', 'KOOIKUNNIL SURES,''', 'Congress', 0, '', 25, 0, 0, 0, 0, 0, 0),
('Kerala', 'PATHANAMTHITTA ,', 'ANTO ANTONY', 'Congress', 0, '', 26, 0, 0, 0, 0, 0, 0),
('Kerala', 'ATTINGAL ''ADV', 'SMT. BINDU KRISHNA', 'Congress', 0, '', 27, 0, 0, 0, 0, 0, 0),
('Kerala', 'THIRUVANANTHAPURAM', 'DR. SHASHI THAROOR', 'Congress', 0, '', 28, 0, 0, 0, 0, 0, 0),
('Madhya Pradesh', 'MORENA', 'GOV1ND SINGH', 'Congress', 0, '', 29, 0, 0, 0, 0, 0, 0),
('Madhya Pradesh', 'MANDLA - ST', 'OMKAR MARKAIA', 'Congress', 0, '', 30, 0, 0, 0, 0, 0, 0),
('Madhya Pradesh', 'HOSHANGABAD', 'DEVENDRA PATEL', 'Congress', 0, '', 31, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'AKOLA', 'HIDAYAT PATEL', 'Congress', 0, '', 32, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'WARD..', 'SAGAR MEGHE', 'Congress', 0, '', 33, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'GADCHIROLI-CHIMUR - ST', 'DR. NAMDEO USENDI', 'Congress', 0, '', 34, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'HINGOLI', 'RAJEEV SATAV', 'Congress', 0, '', 35, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'ALNA', 'VILAS AUTADE', 'Congress', 0, '', 36, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'BHIWANDI', 'VISHWANATH PATIL', 'Congress', 0, '', 37, 0, 0, 0, 0, 0, 0),
('Mahararashtra', 'HATKANANGLE', 'KALLAPPA AWADE', 'Congress', 0, '', 38, 0, 0, 0, 0, 0, 0),
('Meghalaya', 'SHILLONG -ST', 'VINCENT hi. PALA', 'Congress', 0, '', 39, 0, 0, 0, 0, 0, 0),
('Nagaland', 'NAGALAND', 'K.V. PUSH', 'Congress', 0, '', 40, 0, 0, 0, 0, 0, 0),
('Orissa', 'SUNDARGARH -Si', 'HEN1ANAND BISWAL', 'Congress', 0, '', 41, 0, 0, 0, 0, 0, 0),
('Orissa', 'SAMBALPUR', 'AMARNATH PRADHAN', 'Congress', 0, '', 42, 0, 0, 0, 0, 0, 0),
('Orissa', 'MAYLIRBHANJ -51', 'SHYAM SUNDAR HANSDAH', 'Congress', 0, '', 43, 0, 0, 0, 0, 0, 0),
('Orissa', 'KALAHANDI', '131-LAKTA CHARAN DAS', 'Congress', 0, '', 44, 0, 0, 0, 0, 0, 0),
('Orissa', 'INABARANOPUR - ST', 'PRADEEP KUMAR MAJHI', 'Congress', 0, '', 45, 0, 0, 0, 0, 0, 0),
('Orissa', 'IKANDHAMAL', 'HARIHAR KAHAN', 'Congress', 0, '', 46, 0, 0, 0, 0, 0, 0),
('Rajasthan', 'JHUNJHUNU', 'DR. $MT. RAJBALA OLA', 'Congress', 0, '', 47, 0, 0, 0, 0, 0, 0),
('Rajasthan', 'UDAIPUR - ST', 'RAGHUV1R. SINGH MEENA', 'Congress', 0, '', 48, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'MORADABAD', 'BEGUM NOOR BAND', 'Congress', 0, '', 49, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'LUCKNOW', 'SMT. RITA BAHUGUNAJOSHI', 'Congress', 0, '', 50, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'ETAWAH - SC', 'SMT. HANSMUKHI SANKHWAR', 'Congress', 0, '', 51, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'KAUSHAMBI -. SC', 'MAHENDRA GAUTAM', 'Congress', 0, '', 52, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'AMBEDKAR RADAR', 'ASHOK SINGH', 'Congress', 0, '', 53, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'DOMARIYAGANJ', 'TARUN PATEL', 'Congress', 0, '', 54, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'SANT KABIR NAGAR', 'ROHIT PANDEY', 'Congress', 0, '', 55, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'MACHHLISHAHR - SC', 'TUFANI NISHAD', 'Congress', 0, '', 56, 0, 0, 0, 0, 0, 0),
('Uttar Pradesh', 'MIRZAPUR', 'LALITESH PATI TRIPATHI', 'Congress', 0, '', 57, 0, 0, 0, 0, 0, 0),
('Chandigarh', 'CHANDIGARH', 'PAWAN KUMAR BANSAL', 'Congress', 0, '', 58, 0, 0, 0, 0, 0, 0),
('Lakshadweep', 'LAKSHADWEEP (Si)', 'HAMDULLAH SAYEED', 'Congress', 0, '', 59, 0, 0, 0, 0, 0, 0),
('Puducherry', 'PUDUCHERRY', 'V. NARAYANASAMY', 'Congress', 0, '', 60, 0, 0, 0, 0, 0, 0),
('Delhi', 'NEW DELHI', 'Ashish Khetan', 'AAP', 0, '', 61, 0, 0, 0, 0, 0, 0),
('Delhi', 'SOUTH DELHI', 'Col Devender Sehrawat', 'AAP', 0, '', 62, 0, 0, 0, 0, 0, 0),
('Haryana', 'Ambala (SC)', 'SP Singh', 'AAP', 0, '', 63, 0, 0, 0, 0, 0, 0),
('Haryana', 'Bhiwani', 'Lalit Agarwal', 'AAP', 0, '', 64, 0, 0, 0, 0, 0, 0),
('Haryana', 'Faridabad', 'Purshottam Dagar', 'AAP', 0, '', 65, 0, 0, 0, 0, 0, 0),
('Haryana', 'Karnal', 'Paramjeet', 'AAP', 0, '', 66, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore Central', 'V. Balakrishnan', 'AAP', 0, '', 67, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore North', 'Prof Babu Mathew', 'AAP', 0, '', 68, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore Rural', 'Ravikrishna Reddy', 'AAP', 0, '', 69, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bangalore South', 'Nina P. Nayak', 'AAP', 0, '', 70, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Bidar', 'Chandrakant Kulkarni', 'AAP', 0, '', 71, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Chikballapur', 'K. Arkesh', 'AAP', 0, '', 72, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Chikkodi', 'Ashfaq Ahmed Madaki', 'AAP', 0, '', 73, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Dakshina Kannada', 'M. R. Vasudeva', 'AAP', 0, '', 74, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Gulbarga (SC)', 'Dr (Mrs) B.T.Lalitha Naik', 'AAP', 0, '', 75, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Hubli-Dharwad', 'Hemant Kumar', 'AAP', 0, '', 76, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Kolar (SC)', 'KotiganahalliRamaiah', 'AAP', 0, '', 77, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Raichur', 'Bhimaraya', 'AAP', 0, '', 78, 0, 0, 0, 0, 0, 0),
('Karnataka', 'Shimoga', 'G. Sridhara Kallahalla', 'AAP', 0, '', 79, 0, 0, 0, 0, 0, 0),
('Punjab', 'Faridkot (SC)', 'Prof. Sadhu Singh', 'AAP', 0, '', 80, 0, 0, 0, 0, 0, 0),
('Punjab', 'Gurdaspur', 'Sucha Singh Chottepur', 'AAP', 0, '', 81, 0, 0, 0, 0, 0, 0),
('Punjab', 'Sangrur', 'Bhagwant Mann', 'AAP', 0, '', 82, 0, 0, 0, 0, 0, 0),
('UP', 'Agra (SC)', 'Ravindra Singh', 'AAP', 0, '', 83, 0, 0, 0, 0, 0, 0),
('UP', 'Aligarh', 'Sabir Rahi', 'AAP', 0, '', 84, 0, 0, 0, 0, 0, 0),
('UP', 'Ambedkar Nagar', 'Kramveer Chakravarti', 'AAP', 0, '', 85, 0, 0, 0, 0, 0, 0),
('UP', 'Amroha', 'Mullana Kalbe Rushaid', 'AAP', 0, '', 86, 0, 0, 0, 0, 0, 0),
('UP', 'Aonla', 'Naresh Singh', 'AAP', 0, '', 87, 0, 0, 0, 0, 0, 0),
('UP', 'Azamgarh', 'Rajesh Yadav', 'AAP', 0, '', 88, 0, 0, 0, 0, 0, 0),
('UP', 'Bareily', 'Sunil Kumar', 'AAP', 0, '', 89, 0, 0, 0, 0, 0, 0),
('UP', 'BHADOHI', 'Varis Aqbal Khan', 'AAP', 0, '', 90, 0, 0, 0, 0, 0, 0),
('UP', 'Bijnor', 'Dr.Gaurav Chauhan', 'AAP', 0, '', 91, 0, 0, 0, 0, 0, 0),
('UP', 'Bulandshahr', 'Rahul Deepanker', 'AAP', 0, '', 92, 0, 0, 0, 0, 0, 0),
('UP', 'DEORIA', 'Arun Kumar Tripathi', 'AAP', 0, '', 93, 0, 0, 0, 0, 0, 0),
('UP', 'DOMARIYAGANJ', 'Badre Alam', 'AAP', 0, '', 94, 0, 0, 0, 0, 0, 0),
('UP', 'Etawah', 'Ujiyare Lal', 'AAP', 0, '', 95, 0, 0, 0, 0, 0, 0),
('UP', 'Fatehpur', 'Jain Ul Haq', 'AAP', 0, '', 96, 0, 0, 0, 0, 0, 0),
('UP', 'Fatehpur sikri', 'Mahaveer Singh Solanki', 'AAP', 0, '', 97, 0, 0, 0, 0, 0, 0),
('UP', 'Gautam Budha Nagar', 'K P Singh', 'AAP', 0, '', 98, 0, 0, 0, 0, 0, 0),
('UP', 'Ghazipur', 'Brajbhushan Dubey', 'AAP', 0, '', 99, 0, 0, 0, 0, 0, 0),
('UP', 'Gonda', 'Mashooq Usmani', 'AAP', 0, '', 100, 0, 0, 0, 0, 0, 0),
('UP', 'GORAKHPUR', 'Prof. Radhey Mohan Mishra', 'AAP', 0, '', 101, 0, 0, 0, 0, 0, 0),
('UP', 'HAMIRPUR (UTTAR PRADESH)', 'Atul Kumar Singh (Prajapati)', 'AAP', 0, '', 102, 0, 0, 0, 0, 0, 0),
('UP', 'Hathras (SC)', 'Sunahari Lal Taank', 'AAP', 0, '', 103, 0, 0, 0, 0, 0, 0),
('UP', 'JAUNPUR', 'Dr. Kailash Prakash Yadav', 'AAP', 0, '', 104, 0, 0, 0, 0, 0, 0),
('UP', 'Jhansi', 'Archana Gupta', 'AAP', 0, '', 105, 0, 0, 0, 0, 0, 0),
('UP', 'Kanpur', 'Dr. Mahmood Husain Rehmani', 'AAP', 0, '', 106, 0, 0, 0, 0, 0, 0),
('UP', 'Kaushambi (SC)', 'Dr. Shitla Prasad', 'AAP', 0, '', 107, 0, 0, 0, 0, 0, 0),
('UP', 'KUSHI NAGAR', 'AKHND PRTAP SINGH', 'AAP', 0, '', 108, 0, 0, 0, 0, 0, 0),
('UP', 'LAKHIMPUR', 'Ashok Raj', 'AAP', 0, '', 109, 0, 0, 0, 0, 0, 0),
('UP', 'Meerut', 'Himanshu Singh', 'AAP', 0, '', 110, 0, 0, 0, 0, 0, 0),
('UP', 'Mohanlalganj', 'Sunil Gautam', 'AAP', 0, '', 111, 0, 0, 0, 0, 0, 0),
('UP', 'Muzzafarnagar', 'Mohammed Yamin', 'AAP', 0, '', 112, 0, 0, 0, 0, 0, 0),
('UP', 'Nagina', 'Sarika Choudhary', 'AAP', 0, '', 113, 0, 0, 0, 0, 0, 0),
('UP', 'Phulpur', 'Shimla Sree', 'AAP', 0, '', 114, 0, 0, 0, 0, 0, 0),
('UP', 'Pilibhit', 'Rajiv Agrawal', 'AAP', 0, '', 115, 0, 0, 0, 0, 0, 0),
('UP', 'Pratapgarh', 'Ashok Kumar Shukla', 'AAP', 0, '', 116, 0, 0, 0, 0, 0, 0),
('UP', 'ROBERTSGANJ(SC)', 'Ram Dhyan Bharti', 'AAP', 0, '', 117, 0, 0, 0, 0, 0, 0),
('UP', 'Salempur', 'Chandra Pratap Singh', 'AAP', 0, '', 118, 0, 0, 0, 0, 0, 0),
('UP', 'Sambhal', 'Hurr Mehdi Baqri Sohail', 'AAP', 0, '', 119, 0, 0, 0, 0, 0, 0),
('UP', 'Sitapur', 'Shefali Misra', 'AAP', 0, '', 120, 0, 0, 0, 0, 0, 0),
('UP', 'Unnao', 'Arvind Kumar (Kamal)', 'AAP', 0, '', 121, 0, 0, 0, 0, 0, 0),
('Arunachal Pradesh', 'Arunachal West', 'Shri Kiren Rijijuji', 'BJP', 0, '', 122, 0, 0, 0, 0, 0, 0),
('Arunachal Pradesh', 'Arunachal East', 'Shri Tapir Gao', 'BJP', 0, '', 123, 0, 0, 0, 0, 0, 0),
('Manipur', 'Inner Manipur', 'Dr. R.K. Ranjan Singh', 'BJP', 0, '', 124, 0, 0, 0, 0, 0, 0),
('Manipur', 'Outer Manipur (ST)', 'Prof. Gangmumei Kamei', 'BJP', 0, '', 125, 0, 0, 0, 0, 0, 0),
('Goa', 'North Goa', 'Shri Shripad Yesso Naik', 'BJP', 0, '', 126, 0, 0, 0, 0, 0, 0),
('Goa', 'South Goa', 'Shri Narendra Keshav Sawaikary', 'BJP', 0, '', 127, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Cooch Behar (SC)', 'Shri Hemchandra Burman, ', 'BJP', 0, '', 128, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Jalpaiguri (SC)', 'Shri Satyalal Sarkar', 'BJP', 0, '', 129, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Balurghat', 'Shri Biswapriya Roychowdhary', 'BJP', 0, '', 130, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Maldaha Uttar', 'Shri Subashkrishna Goswami', 'BJP', 0, '', 131, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Jangipur', 'Shri Samrat Ghosh', 'BJP', 0, '', 132, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Murshidabad', 'Shri Sujit Kumar Ghosh', 'BJP', 0, '', 133, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Krishnanagar', 'Shri Satyabrata Mukherjee', 'BJP', 0, '', 134, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Ranaghat (SC)', 'Dr. Supravat Biswas', 'BJP', 0, '', 135, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Dum Dum', 'Shri Tapan Sikdar', 'BJP', 0, '', 136, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Barasat', 'Shri P.C. Sarkar (Jr.)', 'BJP', 0, '', 137, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Mathurapur (SC)', 'Shri Tapan Naskar', 'BJP', 0, '', 138, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Diamond Harbour', 'Shri Avijit Das', 'BJP', 0, '', 139, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Kolkata Dakshin', 'Shri Tathagata Roy', 'BJP', 0, '', 140, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Kolkata Uttar', 'Shri Rahul Sinha', 'BJP', 0, '', 141, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Howrah', 'Shri George Baker', 'BJP', 0, '', 142, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Uluberia', 'Shri R.K. Mahanti', 'BJP', 0, '', 143, 0, 0, 0, 0, 0, 0),
('West Bengal', 'Bankura', 'Dr. Subash Sarkar', 'BJP', 0, '', 144, 0, 0, 0, 0, 0, 0),
('Odisha', 'Sundargarh (ST)', 'Shri Jual Oram', 'BJP', 0, '', 145, 0, 0, 0, 0, 0, 0),
('Odisha', 'Sambalpur', 'Shri Suresh Pujari', 'BJP', 0, '', 146, 0, 0, 0, 0, 0, 0),
('Odisha', 'Dhenkanal', 'Shri Rudra Narayan Pani', 'BJP', 0, '', 147, 0, 0, 0, 0, 0, 0),
('Odisha', 'Bolangir', 'Smt. Sangeeta Kumari Singh Deo', 'BJP', 0, '', 148, 0, 0, 0, 0, 0, 0),
('Odisha', 'Nabarangpur (ST)', 'Shri Parsuram Majhi', 'BJP', 0, '', 149, 0, 0, 0, 0, 0, 0),
('Odisha', 'Jagatsinghpur (SC)', 'Shri Baidhar Mallik', 'BJP', 0, '', 150, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Dhule', 'Dr. Subhash Bhamre', 'BJP', 0, '', 151, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Jalgaon', 'Shri Ashok Tapiram Patil', 'BJP', 0, '', 152, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Raver', 'Shri Haribhau Javle', 'BJP', 0, '', 153, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Akola', 'Shri Sanjya Dhotre', 'BJP', 0, '', 154, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Nagpur', 'Shri Nitin Gadkari', 'BJP', 0, '', 155, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Bhandara - Gondiya', 'Shri Nana Patole', 'BJP', 0, '', 156, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Gadchiroli-Chimur (ST)', 'Shri Ashok Nete', 'BJP', 0, '', 157, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Chandrapur', 'Shri Hansraj Ahir', 'BJP', 0, '', 158, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Nanded', 'Shri D.B. Patil', 'BJP', 0, '', 159, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Jalna', 'Shri Ravsaheb Danve Patil', 'BJP', 0, '', 160, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Dindori (ST)', 'Shri Harishchandra Chowhan', 'BJP', 0, '', 161, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Palghar (ST)', 'Ad. Chintaman Vanga', 'BJP', 0, '', 162, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Mumbai North', 'Shri Gopal Shetti', 'BJP', 0, '', 163, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Mumbai North East', 'Dr. Kirit Somaiya', 'BJP', 0, '', 164, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Ahmadnagar', 'Shri Dilip Gandhi', 'BJP', 0, '', 165, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Beed', 'Shri Gopinath Munde', 'BJP', 0, '', 166, 0, 0, 0, 0, 0, 0),
('Maharashtra', 'Sangli', 'Shri Sanjaykaka Patil', 'BJP', 0, '', 167, 0, 0, 0, 0, 0, 0),
('Himachal Pradesh', 'Kangra', 'Shri Shanta Kumar', 'BJP', 0, '', 168, 0, 0, 0, 0, 0, 0),
('Himachal Pradesh', 'Hamirpur', 'Shri Anurag Thakur', 'BJP', 0, '', 169, 0, 0, 0, 0, 0, 0),
('Himachal Pradesh', 'Shimla (SC)', 'Shri Virendra Kashyap', 'BJP', 0, '', 170, 0, 0, 0, 0, 0, 0),
('Jammu & Kashmir', 'Baramulla', 'Shri Gulam Mohammad Meer', 'BJP', 0, '', 171, 0, 0, 0, 0, 0, 0),
('Jammu & Kashmir', 'Anantnag', 'Mushtaq Ahmad Malik', 'BJP', 0, '', 172, 0, 0, 0, 0, 0, 0),
('Jammu & Kashmir', 'Ladakh', 'Shri Thunpsthan Chhewang', 'BJP', 0, '', 173, 0, 0, 0, 0, 0, 0),
('Jammu & Kashmir', 'Udhampur', 'Dr. Jitendra Singh', 'BJP', 0, '', 174, 0, 0, 0, 0, 0, 0),
('Jammu & Kashmir', 'Jammu', 'Shri Jugal Kishore Sharma', 'BJP', 0, '', 175, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `primeminister`
--

CREATE TABLE IF NOT EXISTS `primeminister` (
  `name` varchar(30) NOT NULL,
  `age` int(3) NOT NULL,
  `qualification` varchar(50) NOT NULL,
  `experience` varchar(50) NOT NULL,
  `party` varchar(30) NOT NULL,
  `rating` varchar(30) NOT NULL,
  `manifesto` varchar(200) NOT NULL,
  `numb` int(3) NOT NULL,
  `path` varchar(50) NOT NULL,
  `women` int(3) NOT NULL,
  `education` int(3) NOT NULL,
  `health` int(3) NOT NULL,
  `corruption` int(3) NOT NULL,
  `technology` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `primeminister`
--

INSERT INTO `primeminister` (`name`, `age`, `qualification`, `experience`, `party`, `rating`, `manifesto`, `numb`, `path`, `women`, `education`, `health`, `corruption`, `technology`) VALUES
('Narendra Modi', 54, 'Graduation in Political Scienc', 'CM of Gujrat', 'BJP', '4.5', 'Unity in Diversity', 8, 'http://10.0.0.2/vote/images/01.jpg', 4, 4, 4, 4, 4),
('Arvind Kejriwal', 49, 'Graduated from IIT', 'CM of Delhi', 'AAP', '4', 'Common Man Issues', 5, 'http://10.0.0.2/vote/images/02.jpg', 2, 3, 3, 4, 2),
('Rahul Gandhi', 44, 'Graduate from Harvard', 'Congress Youth President', 'Congress', '3.5', 'Non Violence', 5, 'http://10.0.0.2/vote/images/03.jpg', 5, 2, 2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `const` varchar(30) NOT NULL,
  `deviceid` varchar(30) NOT NULL,
  `flag` int(3) NOT NULL,
  `sex` varchar(3) NOT NULL,
  `age` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `email`, `const`, `deviceid`, `flag`, `sex`, `age`) VALUES
('rajiv', '', 'bangalore', '0', 0, 'M', '67'),
('rajiv', '', 'bangalore', '0', 0, 'M', '35'),
('tg', '', 'hdh', '0', 0, 'M', '57'),
('fhj', '', 'fhh', '0', 0, 'M', '66'),
('fy', '', 'HGH', '0', 0, 'M', '57'),
('ryg', '', 'ugh', '0', 0, 'M', '78'),
('thji', '', 'fgh', '0', 0, 'M', '76'),
('tfg', '', 'hfhh', '0', 0, 'M', '57'),
('rgff', '', 'gcjj', '0', 0, 'M', '48'),
('dutch', '', 'ch', '0', 0, 'M', '47'),
('ghhv', '', 'Di', '0', 0, 'M', '37'),
('yhb', '', 'ughh', '0', 0, 'M', '46'),
('ghb', '', 'fjh', '0', 0, 'M', '57'),
('rfv', '', 'GUI', '0', 0, 'M', '67'),
('ggi', '', 'djgu', '0', 0, 'M', '57'),
('gch', '', 'JVC', '0', 0, 'M', '47'),
('tuu', '', 'KFC', '0', 0, 'M', '57'),
('dyv', '', 'bangalore', '0', 0, 'M', '36'),
('dyv', '', 'bangalore', '0', 0, 'M', '36'),
('rajiv', '', 'bangal', '0', 0, 'M', '23'),
('rajiv', '', 'bangalore', '0', 0, 'M', '23'),
('rsh', '', 'bangalore ', '0', 0, 'M', '23');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
