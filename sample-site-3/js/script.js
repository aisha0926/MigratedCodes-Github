$(".news").hover(function() {
    $(".news").addClass("show");
    $(".price").attr("aria-expanded", 'true');
    $(".news").addClass("show");
}, function() {
    $(".news").removeClass("show");
    $(".price").attr("aria-expanded", 'false');
    $(".news").removeClass("show");
});

$(".forSale").hover(function() {
    $(".forSale").addClass("show");
    $(".price").attr("aria-expanded", 'true');
    $(".forSale").addClass("show");
}, function() {
    $(".forSale").removeClass("show");
    $(".price").attr("aria-expanded", 'false');
    $(".forSale").removeClass("show");
});

$(".toRent").hover(function() {
    $(".toRent").addClass("show");
    $(".price").attr("aria-expanded", 'true');
    $(".toRent").addClass("show");
}, function() {
    $(".toRent").removeClass("show");
    $(".price").attr("aria-expanded", 'false');
    $(".toRent").removeClass("show");
});

$(".housePrices").hover(function() {
    $(".housePrices").addClass("show");
    $(".price").attr("aria-expanded", 'true');
    $(".housePrices").addClass("show");
}, function() {
    $(".housePrices").removeClass("show");
    $(".price").attr("aria-expanded", 'false');
    $(".housePrices").removeClass("show");
});

$(".newHomeDropdown").hover(function() {
    $(".newHomeDropdown").addClass("show");
    $(".price").attr("aria-expanded", 'true');
    $(".newHomeDropdown").addClass("show");
}, function() {
    $(".newHomeDropdown").removeClass("show");
    $(".price").attr("aria-expanded", 'false');
    $(".newHomeDropdown").removeClass("show");
});

$("#housePriceCard").hide();

function forSale() {
    $(".navForSale").addClass("active");
    $(".navToRent").removeClass("active");
    $(".navHousePrices").removeClass("active");
    $("#housePriceCard").hide();
    $("#forSaleCard").show();
    $("#top").css("padding-bottom", "6rem");
    $(".card-body").css("height", "");
}

function toRent() {
    $(".navForSale").removeClass("active");
    $(".navToRent").addClass("active");
    $(".navHousePrices").removeClass("active");
    $("#housePriceCard").hide();
    $("#forSaleCard").show();
    $("#top").css("padding-bottom", "6rem");
    $(".card-body").css("height", "");
}

function housePrices() {
    $(".navForSale").removeClass("active");
    $(".navToRent").removeClass("active");
    $(".navHousePrices").addClass("active");

    $("#housePriceCard").show();
    $("#forSaleCard").hide();
    // $(".card-body").css("height", "305px");
}

$(".navbar-toggler").click(function() {
    $(".bg").toggleClass("bg-toggle-on");
    $(".imgBackground").toggleClass("imgBackground-toggle");
});