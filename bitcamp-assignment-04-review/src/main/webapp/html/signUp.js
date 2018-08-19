"use strict";

$('#addBtn').click(() => {
    $.post(`${serverApiAddr}`, {}, () => {}, 'json')
});