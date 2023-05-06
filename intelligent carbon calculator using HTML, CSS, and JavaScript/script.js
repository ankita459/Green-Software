function calculateCarbon() {
    var serverType = document.getElementById("server-type").value;
    var serverSpecs = document.getElementById("server-specs").value;
    var serverHours = document.getElementById("server-hours").value;
    var userCount = document.getElementById("user-count").value;
  
    // Perform calculations here
    var carbonFootprint = 0;
  
    if (serverType === "shared") {
      carbonFootprint = 0.00002 * serverHours * userCount;
    } else if (serverType === "vps") {
      carbonFootprint = 0.0002 * serverHours * userCount;
    } else if (serverType === "dedicated") {
      carbonFootprint = 0.002 * serverHours * userCount;
    }
  
    // Display the result
    document.getElementById("result").innerHTML= "Your carbon footprint is " + carbonFootprint.toFixed(4) + " kgCO2e per day.";
    
}
  