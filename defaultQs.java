package quizGenerator;

public class defaultQs {
    class Math{
        String[] math = new String[10];
        String[] mathSl = new String[10];
        String[] mathHn = new String[10];

        Math(){
        math[0] = "What is 2 + 2?";
        mathSl[0] = "4";
        mathHn[0] = "Simple addition";

        math[1] = "What is the square root of 16?";
        mathSl[1] = "4";
        mathHn[1] = "What number multiplied by itself gives 16?";

        math[2] = "What is 10 divided by 2?";
        mathSl[2] = "5";
        mathHn[2] = "Half of 10";

        math[3] = "What is 5 multiplied by 6?";
        mathSl[3] = "30";
        mathHn[3] = "Use multiplication table of 5 or 6";

        math[4] = "What is 15 minus 7?";
        mathSl[4] = "8";
        mathHn[4] = "Subtract 7 from 15";

        math[5] = "What is the value of π (pi) approximately?";
        mathSl[5] = "3.14";
        mathHn[5] = "It's a famous irrational number used in circles";

        math[6] = "What is 3 squared?";
        mathSl[6] = "9";
        mathHn[6] = "3 multiplied by 3";

        math[7] = "What is the factorial of 4?";
        mathSl[7] = "24";
        mathHn[7] = "4 × 3 × 2 × 1";

        math[8] = "Is 9 an odd number?";
        mathSl[8] = "Yes";
        mathHn[8] = "Odd numbers are not divisible by 2";

        math[9] = "What is 100 divided by 25?";
        mathSl[9] = "4";
        mathHn[9] = "How many 25s make 100?";

    }
        Math(String intermediate){
        math[0] = "What is the value of 7² + 3²?";
        mathSl[0] = "58";
        mathHn[0] = "Square both numbers and add";

        math[1] = "Solve for x: 2x + 5 = 17";
        mathSl[1] = "6";
        mathHn[1] = "Subtract 5, then divide by 2";

        math[2] = "What is the value of √144?";
        mathSl[2] = "12";
        mathHn[2] = "What number squared equals 144?";

        math[3] = "What is the LCM of 12 and 18?";
        mathSl[3] = "36";
        mathHn[3] = "Find the smallest common multiple";

        math[4] = "Find the area of a triangle with base 10 and height 6";
        mathSl[4] = "30";
        mathHn[4] = "Use: (1/2) × base × height";

        math[5] = "If 3x = 27, what is x?";
        mathSl[5] = "9";
        mathHn[5] = "Divide both sides by 3";

        math[6] = "What is the cube of 4?";
        mathSl[6] = "64";
        mathHn[6] = "Multiply 4 × 4 × 4";

        math[7] = "What is the perimeter of a square with side length 8?";
        mathSl[7] = "32";
        mathHn[7] = "Use: 4 × side";

        math[8] = "Convert 0.75 into a fraction";
        mathSl[8] = "3/4";
        mathHn[8] = "Think quarters of a whole";

        math[9] = "Simplify: (2x + 3x - x)";
        mathSl[9] = "4x";
        mathHn[9] = "Combine like terms";
    }
        Math(int number){
            math[0] = "What is the derivative of f(x) = x³ + 2x² - x + 5?";
            mathSl[0] = "3x² + 4x - 1";
            mathHn[0] = "Use power rule for each term";

            math[1] = "Solve: ∫(2x² + 3x + 1) dx";
            mathSl[1] = "(2/3)x³ + (3/2)x² + x + C";
            mathHn[1] = "Integrate term by term, add C";

            math[2] = "Find the roots of the equation: x² - 5x + 6 = 0";
            mathSl[2] = "x = 2, 3";
            mathHn[2] = "Factor the quadratic";

            math[3] = "If sin(θ) = 3/5 and θ is in Quadrant II, find cos(θ)";
            mathSl[3] = "-4/5";
            mathHn[3] = "Use identity: sin²θ + cos²θ = 1, watch the sign";

            math[4] = "What is the determinant of the matrix [[2,3],[1,4]]?";
            mathSl[4] = "5";
            mathHn[4] = "Use: ad - bc";

            math[5] = "Find the sum of the first 20 terms of the arithmetic sequence: 5, 8, 11...";
            mathSl[5] = "650";
            mathHn[5] = "Use: Sₙ = n/2 × (2a + (n-1)d)";

            math[6] = "Evaluate the limit: lim(x→0) (sin x)/x";
            mathSl[6] = "1";
            mathHn[6] = "Standard trigonometric limit";

            math[7] = "If log₂(x) = 5, what is x?";
            mathSl[7] = "32";
            mathHn[7] = "Rewrite as exponential: x = 2⁵";

            math[8] = "What is the 10th term of the geometric sequence: 3, 6, 12, ...?";
            mathSl[8] = "1536";
            mathHn[8] = "Use: aₙ = a·rⁿ⁻¹";

            math[9] = "What is the solution to |2x - 3| = 7?";
            mathSl[9] = "x = 5 or -2";
            mathHn[9] = "Split into two cases: 2x - 3 = 7 and 2x - 3 = -7";
        }
    }
    class physics{
        String[] physics = new String[10];
        String[] physicsSl = new String[10];
        String[] physicsHn = new String[10];

        physics(){
        physics[0] = "How many laws of motion did Newton propose?";
        physicsSl[0] = "3";
        physicsHn[0] = "Think of second prime number";

        physics[1] = "What is the speed of light in vacuum?";
        physicsSl[1] = "3 × 10^8 m/s";
        physicsHn[1] = "It starts with 3 and is followed by 8 zeros";

        physics[2] = "What is the unit of force?";
        physicsSl[2] = "Newton";
        physicsHn[2] = "Named after the scientist who formulated motion laws";

        physics[3] = "What is the acceleration due to gravity on Earth?";
        physicsSl[3] = "9.8 m/s²";
        physicsHn[3] = "It's slightly less than 10";

        physics[4] = "What is the formula of Work?";
        physicsSl[4] = "Work = Force × Distance";
        physicsHn[4] = "Work involves force and displacement";

        physics[5] = "What is the unit of energy?";
        physicsSl[5] = "Joule";
        physicsHn[5] = "Named after physicist James Prescott ___";

        physics[6] = "Which device is used to measure temperature?";
        physicsSl[6] = "Thermometer";
        physicsHn[6] = "It usually contains mercury or alcohol";

        physics[7] = "Which type of lens is used in a magnifying glass?";
        physicsSl[7] = "Convex lens";
        physicsHn[7] = "It bulges outward";

        physics[8] = "What is Ohm's Law?";
        physicsSl[8] = "V = IR";
        physicsHn[8] = "Relates voltage, current, and resistance";

        physics[9] = "What type of energy is stored in a stretched spring?";
        physicsSl[9] = "Potential energy";
        physicsHn[9] = "It's energy due to position or condition";

    }
        physics(String intermediate){
            physics[0] = "What is the acceleration of a 10 kg object when a force of 50 N is applied?";
            physicsSl[0] = "5 m/s2";
            physicsHn[0] = "Use Newton’s 2nd Law: F = ma(use unit)";

            physics[1] = "A car speeds up from 10 m/s to 30 m/s in 4 seconds. What is its acceleration?";
            physicsSl[1] = "5 m/s2";
            physicsHn[1] = "Use: a = (v - u) / t (use unit)";

            physics[2] = "What is the momentum of a 2 kg object moving at 3 m/s?";
            physicsSl[2] = "6 kg*m/s";
            physicsHn[2] = "Use: p = mv (use unit)";

            physics[3] = "If a wave has a frequency of 5 Hz and a wavelength of 2 m, what is its speed?";
            physicsSl[3] = "10 m/s";
            physicsHn[3] = "Use: v = f × λ (use unit)";

            physics[4] = "What is the potential energy of a 2 kg object held 10 m above the ground? (g = 9.8 m/s²)";
            physicsSl[4] = "196 J";
            physicsHn[4] = "Use: PE = mgh (use unit)";

            physics[5] = "What is the kinetic energy of a 4 kg object moving at 3 m/s?";
            physicsSl[5] = "18 J";
            physicsHn[5] = "Use: KE = 0.5 × m × v2 (use unit)";

            physics[6] = "A circuit has a 12 V battery and a 4 Ω resistor. What is the current?";
            physicsSl[6] = "3 A";
            physicsHn[6] = "Use Ohm’s Law: I = V/R (use unit)";

            physics[7] = "What is the work done when a force of 20 N moves an object 3 m?";
            physicsSl[7] = "60 J";
            physicsHn[7] = "Use: Work = Force × Distance (use unit)";

            physics[8] = "Light takes 8 minutes to reach Earth from the Sun. How far is the Sun from Earth? (Speed of light = 3×10⁸ m/s)";
            physicsSl[8] = "1.44 × 10¹¹ m";
            physicsHn[8] = "Convert time to seconds and use: distance = speed × time (use unit)";

            physics[9] = "What is the pressure exerted by a 200 N force on an area of 0.5 m²?";
            physicsSl[9] = "400 Pa";
            physicsHn[9] = "Use: Pressure = Force / Area (use unit)";
        }
        physics(int number){
            physics[0] = "A 2 kg block slides down a 30° incline with no friction. What is its acceleration?";
            physicsSl[0] = "4.9 m/s²";
            physicsHn[0] = "Use: a = g·sin(θ), g = 9.8 m/s²";

            physics[1] = "What is the escape velocity from Earth? (Radius = 6.4×10⁶ m, g = 9.8 m/s²)";
            physicsSl[1] = "11.2 km/s";
            physicsHn[1] = "Use: v = √(2gR)";

            physics[2] = "A 5 μC charge is placed in an electric field of 3×10⁴ N/C. What is the force on the charge?";
            physicsSl[2] = "0.15 N";
            physicsHn[2] = "Use: F = qE (convert μC to C)";

            physics[3] = "A mass attached to a spring oscillates with a frequency of 2 Hz. What is its period?";
            physicsSl[3] = "0.5 s";
            physicsHn[3] = "Use: T = 1/f";

            physics[4] = "What is the magnetic force on a 0.2 m wire carrying 5 A at right angles to a 0.3 T field?";
            physicsSl[4] = "0.3 N";
            physicsHn[4] = "Use: F = BIL·sin(θ), θ = 90°";

            physics[5] = "What is the energy of a photon with wavelength 500 nm?";
            physicsSl[5] = "3.97 × 10⁻¹⁹ J";
            physicsHn[5] = "Use: E = hc/λ (h = 6.63×10⁻³⁴, c = 3×10⁸)";

            physics[6] = "A ball is thrown vertically upwards with 20 m/s. How long until it returns to the thrower?";
            physicsSl[6] = "4.08 s";
            physicsHn[6] = "Time up = v/g; total time = 2 × time up";

            physics[7] = "What is the angular velocity of a wheel rotating 300 times per minute?";
            physicsSl[7] = "31.42 rad/s";
            physicsHn[7] = "Convert RPM to rad/s: ω = 2π × f";

            physics[8] = "If an object moving at 0.8c has rest mass 2 kg, what is its relativistic mass?";
            physicsSl[8] = "3.33 kg";
            physicsHn[8] = "Use: m = m₀ / √(1 - v²/c²)";

            physics[9] = "A transformer steps 240 V to 12 V using 400 turns in the primary. Find the secondary turns.";
            physicsSl[9] = "20 turns";
            physicsHn[9] = "Use: V₁/V₂ = N₁/N₂";

        }
    }
    class GK{
        String[] gk = new String[10];
        String[] gkSl = new String[10];
        String[] gkHn = new String[10];

        GK(){
            gk[0] = "What is the capital of France?";
            gkSl[0] = "Paris";
            gkHn[0] = "It's known as the City of Light";

            gk[1] = "Who was the first president of the United States?";
            gkSl[1] = "George Washington";
            gkHn[1] = "He appears on the U.S. one-dollar bill";

            gk[2] = "How many continents are there in the world?";
            gkSl[2] = "7";
            gkHn[2] = "Think of Asia, Africa, Europe...";

            gk[3] = "Which planet is known as the Red Planet?";
            gkSl[3] = "Mars";
            gkHn[3] = "It's the 4th planet from the Sun";

            gk[4] = "What is the largest ocean on Earth?";
            gkSl[4] = "Pacific Ocean";
            gkHn[4] = "It’s between Asia and the Americas";

            gk[5] = "Who wrote the play 'Romeo and Juliet'?";
            gkSl[5] = "William Shakespeare";
            gkHn[5] = "Famous English playwright and poet";

            gk[6] = "Which country is known as the Land of the Rising Sun?";
            gkSl[6] = "Japan";
            gkHn[6] = "It’s in East Asia and famous for cherry blossoms";

            gk[7] = "What is the smallest prime number?";
            gkSl[7] = "2";
            gkHn[7] = "It’s the only even prime number";

            gk[8] = "Which animal is known as the King of the Jungle?";
            gkSl[8] = "Lion";
            gkHn[8] = "It roars and lives in the savannah";

            gk[9] = "In which year did World War II end?";
            gkSl[9] = "1945";
            gkHn[9] = "Just after the atomic bomb was dropped";
        }
        GK(String intermediate){
            gk[0] = "Who is the noble prize winner of Bangladesh?";
            gkSl[0] = "Sheikh Hasina";
            gkHn[0] = "Head of current interim government.";

            gk[1] = "What is the national flower of Bangladesh?";
            gkSl[1] = "Shapla (Water Lily)";
            gkHn[1] = "It grows in water and is white or pink.";

            gk[2] = "Which language movement occurred in 1952?";
            gkSl[2] = "Bengali Language Movement";
            gkHn[2] = "Led to International Mother Language Day.";

            gk[3] = "What is the capital of Bangladesh?";
            gkSl[3] = "Dhaka";
            gkHn[3] = "Also the most densely populated city in the country.";

            gk[4] = "What is the currency of Bangladesh?";
            gkSl[4] = "Taka";
            gkHn[4] = "Symbol: ৳";

            gk[5] = "In which year did Bangladesh gain independence?";
            gkSl[5] = "1971";
            gkHn[5] = "After the Liberation War.";

            gk[6] = "What is the national animal of Bangladesh?";
            gkSl[6] = "Royal Bengal Tiger";
            gkHn[6] = "Found in the Sundarbans.";

            gk[7] = "What is the name of the longest river in Bangladesh?";
            gkSl[7] = "Padma";
            gkHn[7] = "It originates from the Ganges.";

            gk[8] = "What is the national fruit of Bangladesh?";
            gkSl[8] = "Jackfruit";
            gkHn[8] = "It's large, green, and spiky.";

            gk[9] = "Who is known as the Father of the Nation in Bangladesh?";
            gkSl[9] = "Sheikh Mujibur Rahman";
            gkHn[9] = "He gave the historic March 7 speech.";

        }
        GK(int number){
            gk[1] = "What is the highest civilian award in Bangladesh?";
            gkSl[1] = "Swadhinata Padak";
            gkHn[1] = "Awarded on March 26 each year.";

            gk[2] = "Which Bangladeshi won the Nobel Peace Prize?";
            gkSl[2] = "Dr. Muhammad Yunus";
            gkHn[2] = "Known for microfinance and Grameen Bank.";

            gk[3] = "Which district is known as the ‘City of Education’?";
            gkSl[3] = "Rajshahi";
            gkHn[3] = "It has many prominent educational institutions.";

            gk[4] = "When was the Chittagong Hill Tracts Peace Accord signed?";
            gkSl[4] = "1997";
            gkHn[4] = "A historic agreement under Sheikh Hasina’s government.";

            gk[5] = "Which is the largest sea port in Bangladesh?";
            gkSl[5] = "Chittagong Port";
            gkHn[5] = "Located in the southeast coastal region.";

            gk[6] = "What is the name of the first satellite launched by Bangladesh?";
            gkSl[6] = "Bangabandhu-1";
            gkHn[6] = "Launched in 2018.";

            gk[7] = "Which is the only UNESCO Natural World Heritage Site in Bangladesh?";
            gkSl[7] = "Sundarbans";
            gkHn[7] = "Home of the Royal Bengal Tiger.";

            gk[8] = "Which is the largest university by area in Bangladesh?";
            gkSl[8] = "University of Rajshahi";
            gkHn[8] = "Located in the northern part of the country.";

            gk[9] = "In which year was the first general election held in independent Bangladesh?";
            gkSl[9] = "1973";
            gkHn[9] = "Two years after independence.";

        }
    }
}
