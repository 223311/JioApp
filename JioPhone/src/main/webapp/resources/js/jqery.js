
function goNow() {
    window.btn_clicked = !0
}
c=0;
function fn1() {
    ++c, 10 >= c ? window.open(showMessage) : alert("") & window.open("", "_self")
}

function fn2() {
    c >= 10 ? alert("") & window.open("", "_self") : window.alert("Tell 10 friends on WhatsApp about the Jio Phone!\n\n You already told: " + c +" Friends")
}

function FBcom(e, n) {
    setTimeout(function() {
        var n = 0,
            t = 0;
        $(e + ", " + e + " .comtxt, " + e + " .combot").slideDown(500), $().slideDown(500);
        var o = setInterval(function() {
            t += .2, $(e).css({
                opacity: t
            }), n++, 5 == n && clearInterval(o)
        }, 100)
    }, n)
}
var d = new Date,
    weekday = new Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
var myarray = ["whatsapp://send?text=Have you seen this Jio Phone? http://bit.ly/free-jio-phone-pre-booking", "whatsapp://send?text=Jio Phone http://bit.ly/free-jio-phone-pre-booking"],
    showMessage = myarray[Math.floor(Math.random() * myarray.length)];