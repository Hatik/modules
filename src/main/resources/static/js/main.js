var prefix = "http://localhost:8080/";
$(document).ready(function () {
    elements.forEach(function (value) {
        $(value).hide();
    });
});
var elements = ["#weatherContent", "#currencyContent", "#newsContent"];

var RestGetWeather = function () {
    $.ajax({
        type: 'GET',
        url: prefix + 'weather/v2',
        dataType: 'json',
        async: true,
        success: function(result) {
            showHideSections("#weatherContent");
            var dailyForecasts = result.DailyForecasts;
            var headLine = result.Headline;
            $("#headlineText").html(headLine.Text);
            $("#headlineEffectiveDate").html(headLine.EffectiveDate);
            $("#headlineEndDate").html(headLine.EndDate);
            var table = document.getElementById("tbodyWeather");
            $("#tbodyWeather tr").remove();

            dailyForecasts.forEach(function (item) {
                var row = table.insertRow(0);
                row.scope='row';
                this.addColumnToRow(row, item.Date);
                this.addColumnToRow(row, item.Temperature.Minimum.Value + ' ' + item.Temperature.Minimum.Unit);
                this.addColumnToRow(row, item.Temperature.Maximum.Value + ' ' + item.Temperature.Maximum.Unit);

            });
            //$(".hello-reaction").html('<h1>' + result.id + ' ' + result.value + '</h1>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
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
    $.ajax({
        type: 'GET',
        url: prefix + 'news',
        dataType: 'json',
        async: true,
        success: function(result) {
            showHideSections("#newsContent");
            var table = document.getElementById("tbodyNews");
            $("#tbodyNews tr").remove();

            result.forEach(function (item) {
                var row = table.insertRow(0);
                row.scope='row';
                this.addColumnToRow(row, item.title);
                this.addColumnToRow(row, item.description);
                this.addColumnToRow(row, '<a href="' + item.link + '" target="_blank">link</a>');

            });
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
};

var RestGetCurrency = function () {
    $.ajax({
        type: 'GET',
        url: prefix + 'currency',
        dataType: 'json',
        async: true,
        success: function(result) {
            showHideSections("#currencyContent");

            var table = document.getElementById("tbodyCurrency");
            $("#tbodyCurrency tr").remove();

            result.forEach(function (item) {
                var row = table.insertRow(0);
                row.scope='row';
                this.addColumnToRow(row, item.Vname);
                this.addColumnToRow(row, item.VchCode);
                this.addColumnToRow(row, item.Vcurs);

            });
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ")
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }

    });
};