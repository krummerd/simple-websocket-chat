var app = angular.module("websocketChat", [])

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];

    $http.get('http://localhost:8088/chat').success(function(data) {
        $scope.websites = data;
    });
});
