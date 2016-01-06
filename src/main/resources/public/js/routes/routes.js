'use strict';
angular.module('spacedOut')
.config(['$stateProvider', '$urlRouterProvider', 
  function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/');

	$stateProvider.state('viewPasses', {
		url: '/viewPasses', 
		templateUrl: 'templates/viewPasses.tpl.html',
		controller: 'viewPassesController'
	}) 
     .state('addPass', {
    	url: '/addPass',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addPassController'
    })
	.state('editPass', { 
        url: '/editPass',
        templateUrl: 'templates/editPass.tpl.html',
        controller: 'editPassController'
    }); 
}]);