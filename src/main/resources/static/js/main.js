var prefix = "http://localhost:8080/";
$(document).ready(function () {
    elements.forEach(function (value) {
        $(value).hide();
    });
});
var elements = ["#weatherContent", "#currencyContent", "#newsContent"];

var RestGetWeather = function () {
    document.getElementById("loader").style.display = "block";
    $.ajax({
        type: 'GET',
        url: prefix + 'weather/v2',
        dataType: 'json',
        async: true,
        success: function(result) {
            document.getElementById("loader").style.display = "none";
            showHideSections("#weatherContent");
            if (result.success) {
                var dailyForecasts = result.data.DailyForecasts;
                var headLine = result.data.Headline;
                $("#headlineText").html(headLine.Text);
                $("#headlineEffectiveDate").html(dateToLocale(headLine.EffectiveDate));
                $("#headlineEndDate").html(dateToLocale(headLine.EndDate));
                var table = document.getElementById("tbodyWeather");
                $("#tbodyWeather tr").remove();

                dailyForecasts.forEach(function (item) {
                    var row = table.insertRow(0);
                    row.scope = 'row';
                    this.addColumnToRow(row, dateToLocale(item.Date));
                    this.addColumnToRow(row, item.Temperature.Minimum.Value + ' ' + item.Temperature.Minimum.Unit);
                    this.addColumnToRow(row, item.Temperature.Maximum.Value + ' ' + item.Temperature.Maximum.Unit);

                });
            }
            else {
                alert("Error occurred: " + result.message);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            document.getElementById("loader").style.display = "none";
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
};
var dateToLocale = function (value) {
    return new Date(value).toLocaleString();
};

var addColumnToRow = function (row, item) {
    var td = row.insertCell();
    td.innerHTML = item;
};
var showHideSections = function (item) {
    this.elements.forEach(function (value) {
        if(value === item) $(value).show();
        else $(value).hide();
    });
};
var RestGetNews = function () {
    document.getElementById("loader").style.display = "block";
    $.ajax({
        type: 'GET',
        url: prefix + 'news',
        dataType: 'json',
        async: true,
        success: function(result) {
            document.getElementById("loader").style.display = "none";
            showHideSections("#newsContent");
            var table = document.getElementById("tbodyNews");
            $("#tbodyNews tr").remove();
            if (result.success) {
                result.data.forEach(function (item) {
                    var row = table.insertRow(0);
                    row.scope = 'row';
                    this.addColumnToRow(row, item.title);
                    this.addColumnToRow(row, item.description);
                    this.addColumnToRow(row, '<a href="' + item.link + '" target="_blank">link</a>');

                });
            }
            else {
                alert("Error occurred: " + result.message);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            document.getElementById("loader").style.display = "none";
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
};

var RestGetCurrency = function () {
    document.getElementById("loader").style.display = "block";
    $.ajax({
        type: 'GET',
        url: prefix + 'currency',
        dataType: 'json',
        async: true,
        success: function(result) {
            document.getElementById("loader").style.display = "none";
            showHideSections("#currencyContent");

            var table = document.getElementById("tbodyCurrency");
            $("#tbodyCurrency tr").remove();

            if (result.success) {
                result.data.forEach(function (item) {
                    var row = table.insertRow(0);
                    row.scope = 'row';
                    this.addColumnToRow(row, item.Vname);
                    this.addColumnToRow(row, item.VchCode);
                    this.addColumnToRow(row, item.Vcurs);

                });
            }
            else {
                alert("Error occurred: " + result.message);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            document.getElementById("loader").style.display = "none";
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
};