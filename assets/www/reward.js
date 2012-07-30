
function onDeviceReady(){
   displayRewards();
}

function displayRewards(){
    var rewardDiv = $('#reward-display');
    var ul = $('<ul>'); // create the ul element

    for (var x=0; x<5; x++){
        ul.append('<li></li>');
    }
    rewardDiv.append(ul);
}

function saveReward(){
    alert('I am saved!');
}