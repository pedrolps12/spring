(function ($) {
    'use strict';

   //========================
   // Intialization
   //========================
   var revSlider         = $('.revSlider'),
       revSlider2        = $('.revSlider2'),
       onsallCaro        = $("#onsallCaro"),
       blogCaro          = $("#blogCaro"),
       h4productCaro     = $("#h4productCaro"),
       thumbProCaro      = $(".thumbProCaro"),
       featureProCaro    = $("#featureProCaro"),
       testmonialCaro    = $("#testmonialCaro"),
       brandsCaro        = $("#brandsCaro"),
       testmonial        = $("#testmonial"),
       lobSlider         = $(".lobSlider"),
       deal_countdown    = $(".deal-countdown"),
       ProductCaro       = $(".ProductCaro"),
       newDesign         = $("#newDesign"),
       onsaleTime        = $(".onsaleTime");
 


//=========================
// Revolution Slider
//=========================
    if ($(".slider1").length > 0)
    {
        revSlider.revolution({
            delay: 8000,
            startwidth: 1170,
            startheight: 700,
            startWithSlide: 0,
            fullScreenAlignForce: "off",
            navigationType: "bullet",
            navigationArrows: "on",
            navigationStyle: "round",
            touchenabled: "on",
            onHoverStop: "on",
            navOffsetHorizontal: 0,
            navOffsetVertical: 20,
            shadow: 0,
            fullWidth: "on",
            fullScreen: "on",
            navigationVOffset: 35

        });
    }
    ;
    if ($(".slider2").length > 0)
    {
        revSlider2.revolution({
            delay: 8000,
            startwidth: 1170,
            startheight: 590,
            startWithSlide: 0,
            fullScreenAlignForce: "off",
            navigationType: "bullet",
            navigationArrows: "on",
            navigationStyle: "round",
            touchenabled: "on",
            onHoverStop: "on",
            navOffsetHorizontal: 0,
            navOffsetVertical: 20,
            shadow: 0,
            fullWidth: "on",
            fullScreen: "on",
            navigationVOffset: 35

        });
    }
    ;
    if ($(".slider3").length > 0)
    {
        revSlider2.revolution({
            delay: 8000,
            startwidth: 1170,
            startheight: 590,
            startWithSlide: 0,
            fullScreenAlignForce: "off",
            navigationType: "bullet",
            navigationArrows: "on",
            navigationStyle: "round",
            touchenabled: "on",
            onHoverStop: "on",
            navOffsetHorizontal: 0,
            navOffsetVertical: 20,
            shadow: 0,
            fullWidth: "on",
            fullScreen: "on",
            navigationVOffset: 35

        });
    }
    ;

    //=========================
    // Home3 Blog
    //=========================
    if (onsallCaro.length > 0) {
        onsallCaro.owlCarousel({
            items: 4,
            navigation: true,
            pagination: false,
            itemsTablet: [800, 2],
            itemsDesktopSmall: [1000, 2],
            navigationText: ["<i class='fa fa-angle-left'></i>", "<i class='fa fa-angle-right'></i>"]
        });
    }
    ;

    //=========================
    // Home2 Blog
    //=========================
    if (blogCaro.length > 0) {
        blogCaro.owlCarousel({
            items: 2,
            navigation: true,
            pagination: false,
            navigationText: ["<i class='fa fa-angle-left'></i>", "<i class='fa fa-angle-right'></i>"],
            itemsDesktop: [1280, 2],
            itemsTablet: [800, 2]
        });
    }
    ;

    //=========================
    // Home4 Product
    //=========================
    if (h4productCaro.length > 0) {
        h4productCaro.owlCarousel({
            items: 4,
            navigation: true,
            pagination: false,
            responsive: true,
            itemsDesktop: [1000, 2],
            navigationText: ["<i class='fa fa-angle-left'></i>", "<i class='fa fa-angle-right'></i>"]
        });
    }
    ;

    //=========================
    // Home4 Thumb Product
    //=========================
    if (thumbProCaro.length > 0) {
        thumbProCaro.owlCarousel({
            singleItem: true,
            navigation: true,
            pagination: false,
            navigationText: ["<i class='fa fa-angle-left'></i>", "<i class='fa fa-angle-right'></i>"]
        });
    }
    ;

    //=========================
    // Featured Product
    //=========================
    if (featureProCaro.length > 0) {
        featureProCaro.owlCarousel({
            items: 4,
            navigation: true,
            pagination: false,
            navigationText: ["<i class='fa fa-angle-left'></i>", "<i class='fa fa-angle-right'></i>"],
            itemsMobile: [479, 1]
        });
    }
    ;

    //=========================
    // Home1 Testmonial
    //=========================
    if (testmonialCaro.length > 0) {
        testmonialCaro.owlCarousel({
            singleItem: true
        });
    }
    ;

    //=========================
    // Home1 Brands
    //=========================
    if (brandsCaro.length > 0) {
        brandsCaro.slick({
            centerMode: true,
            centerPadding: '0',
            slidesToShow: 5,
            infinite: true,
            autoplay: true,
            responsive: [
                {
                    breakpoint: 768,
                    settings: {
                        arrows: false,
                        centerMode: true,
                        centerPadding: '0',
                        slidesToShow: 3
                    }
                },
                {
                    breakpoint: 480,
                    settings: {
                        arrows: false,
                        centerMode: true,
                        centerPadding: '0',
                        slidesToShow: 1
                    }
                }
            ]
        });
    }
    ;



    //=========================
    // Home4 Testmonial
    //=========================
    if (testmonial.length > 0) {
        testmonial.owlCarousel({
            singleItem: true,
            transitionStyle : "goDown"
        });
    }
    ;

    //=========================
    // Home2 Lookbook
    //========================= 
    if (lobSlider.length > 0) {
        lobSlider.owlCarousel({
            singleItem: true
        });
    }
    ;


    //========================
    // Back To Top
    //========================
    $(window).on('scroll', function () {
        if ($(window).scrollTop() > $(window).height())
        {
            $("#backToTop").addClass('showit');
        } else
        {
            $("#backToTop").removeClass('showit');
        }

    });
    $("body, html").on("click", "#backToTop", function (e) {
        e.preventDefault();
        $('html, body').animate({scrollTop: 0}, 800);
    });

    //=======================================================
    // Time CountDown
    //=======================================================
    if (deal_countdown.length > 0) {
        deal_countdown.TimeCircles({
            text_size: .40,
            circle_bg_color: "#fff",
            time: {
                Days: {
                    show: true,
                    text: "Days",
                    color: "#ffffff"
                },
                Hours: {
                    show: true,
                    text: "Hours",
                    color: "#ffffff"
                },
                Minutes: {
                    show: true,
                    text: "Munite",
                    color: "#ffffff"
                },
                Seconds: {
                    show: true,
                    text: "Seconds",
                    color: "#ffffff"
                }
            }
        });
    }
    if (onsaleTime.length > 0) {
        onsaleTime.TimeCircles({
            text_size: .40,
            circle_bg_color: "#fff",
            time: {
                Days: {
                    show: true,
                    text: "",
                    color: "#ffffff"
                },
                Hours: {
                    show: true,
                    text: "",
                    color: "#ffffff"
                },
                Minutes: {
                    show: true,
                    text: "",
                    color: "#ffffff"
                },
                Seconds: {
                    show: true,
                    text: "",
                    color: "#ffffff"
                }
            }
        });
    }
    ;

    //=======================================================
    // Mixer 
    //=======================================================
    if ($('.gallMix').length > 0) {
        $(".gallMix").themeWar();
    };

    //========================
    // Search Option
    //========================
    if ($('#search_option').length > 0) {
        $("#search_option").select2();
    }
    ;
    if (ProductCaro.length > 0) {
        ProductCaro.owlCarousel({
            autoPlay: false,
            navigation: true,
            slideSpeed: 1500,
            paginationSpeed: 500,
            pagination: false,
            items: 4,
            rewindNav: false,
            stopOnHover: true,
            itemsTablet: [800, 2],
            itemsDesktopSmall: [1000, 3],
            navigationText: ["<i class='fa fa-angle-left'>", "<i class='fa fa-angle-right'>"]

        });
    }


    //=========================
    // Home3 Blog
    //=========================
    if (newDesign.length > 0) {
        newDesign.owlCarousel({
            singleItem: true
        });
    }
    ;

    //===================================
    // Bootstrap collaps pluse minuse
    //===================================
    if ($('.collapse').length > 0) {
        $('.collapse').on('shown.bs.collapse', function () {
            $(this).parent().find(".pluseicon").removeClass("pluseicon").addClass("minusicon");
        }).on('hidden.bs.collapse', function () {
            $(this).parent().find(".minusicon").removeClass("minusicon").addClass("pluseicon");
        });
    }
    ;

    //===================================
    // Slider Range
    //===================================
    if ($("#slider-range").length > 0) {
        $("#slider-range").slider({
            range: true,
            min: 0,
            max: 500,
            values: [10, 250],
            slide: function (event, ui) {
                $("#min").html("$" + ui.values[0]);
                $("#max").html("$" + ui.values[1]);
            }
        });
        $("#min").html("$" + $("#slider-range").slider("values", 0));
        $("#max").html("$" + $("#slider-range").slider("values", 1));
    }
    ;


    //========================
    // Our Incredible Skill
    //========================
    $('.skill_set').appear();
    $('.skill_set').on('appear', loadSkills);
    var coun = true;
    function loadSkills()
    {
        $(".singleSkill").each(function () {
            var datacount = $(this).attr("data-limit");
            $(".skill3", this).animate({'width': datacount + '%'}, 2000);
            if (coun)
            {
                $(this).find('.parcen3').each(function () {
                    var $this = $(this);
                    $({Counter: 0}).animate({Counter: datacount}, {
                        duration: 2000,
                        easing: 'swing',
                        step: function () {
                            $this.text(Math.ceil(this.Counter) + '%');
                        }
                    });
                });

            }
        });
        coun = false;
    }
    ;
    //=======================================================
    // Google map
    //=======================================================
    if ($('#map').length > 0) {
        var map;
        map = new GMaps({
            el: '#map',
            lat: -12.056152,
            lng: -77.038830,
            zoomControlOpt: {
                style: 'SMALL',
                position: 'TOP_LEFT'
            },
            scrollwheel: false,
            zoom: 16,
            zoomControl: false,
            panControl: false,
            streetViewControl: false,
            mapTypeControl: false,
            overviewMapControl: false,
            clickable: false
        });
        map.addMarker({
            lat: 51.4584218,
            lng: -0.0813982
        });
    }
    ;

    //=======================================================
    // Cart Button
    //=======================================================
    if ($(".qtyBtn").length > 0)
    {
        $(".btnMinus").on('click', function () {
            var vals = parseInt($(this).next(".carqty").val(), 10);

            if (vals > 0)
            {
                vals -= 1;
                $(this).next(".carqty").val(vals);
            } else
            {
                $(this).next(".carqty").val(vals);
            }
            return false;
        });
        $(".btnPlus").on('click', function () {
            var vals = parseInt($(this).prev(".carqty").val(), 10);
            vals += 1;
            $(this).prev(".carqty").val(vals);
            return false;
        });
    }
    ;

    //=======================================================
    // Payment Accourdion
    //=======================================================
    if ($(".wc_payment_methods").length > 0)
    {
        $(".wc_payment_methods li").each(function () {
            $('input[type="radio"]', this).on('click', function (e) {
                var ids = $(this).attr('id');
                if ($('div.' + ids).hasClass('visibales'))
                {

                } else
                {
                    $(".payment_box").removeClass('visibales');
                    $(".payment_box").slideUp('fast');
                    $('div.' + ids).slideDown('fast').addClass('visibales');
                }
            });
        });
    }
    ;

    //===================================
    // Fixed Header
    //===================================
    $(window).on('scroll', function () {
        if ($(window).scrollTop() > 40)
        {
            $("header").addClass('fixedHeader animated slideInUp');
        } else
        {
            $("header").removeClass('fixedHeader animated slideInUp');
        }
    });
    $(window).on('scroll', function () {
        if ($(window).scrollTop() > 40)
        {
            $("#catToggle").removeClass('in');
        } else
        {
            $("#catToggle").addClass('in');
        }
    });

    //========================
    // Wow Js
    //========================
    new WOW().init();

    //========================
    // Loader 
    //========================
    $(window).load(function () {
        if ($('.preloader').length > 0) {
            $('.preloader').delay(800).fadeOut('slow');
        }
    });


    //=======================================================
    // Color Preset
    //=======================================================
    if ($(".colorPresetArea").length > 0)
    {
        var switchs = true;
        $(".gearBtn").on('click', function (e) {
            e.preventDefault();
            if (switchs)
            {
                $(this).addClass('active');
                $(".colorPresetArea").animate({'left': '0px'}, 400);
                switchs = false;
            } else
            {
                $(this).removeClass('active');
                $(".colorPresetArea").animate({'left': '-290px'}, 400);
                switchs = true;
            }
        });

        $(".mainColors a").on('click', function (e) {
            e.preventDefault();
            var color = $(this).attr('href');
            $(".mainColors a").removeClass('active');
            $(this).addClass('active');
            $("#colorChem").attr('href', 'css/lay_colors/' + color + '.css');
        });
    }
    ;

    $("#patterns a").on('click', function (e) {
        e.preventDefault();
        var bg = $(this).attr('href');
        if ($(".boxed").hasClass('active'))
        {
            //alert(bg);
            $('#patterns a').removeClass('active');
            $(this).addClass('active');
            $('body').removeClass('pat1 pat2 pat3 pat4 pat5 pat6 pat7 pat8 pat9 pat10');
            $('body').addClass(bg);
        } else
        {
            alert('Please, active box layout First.');
        }
    });

    $(".layout").on('click', function (e) {
        e.preventDefault();
        var layout = $(this).attr('href');
        if (layout == 'wide')
        {
            $('body').removeClass('pat1 pat2 pat3 pat4 pat5 pat6 pat7 pat8 pat9 pat10');
        }
        $('.layout').removeClass('active');
        $(this).addClass('active');
        $("#layout").attr('href', 'css/lay_colors/' + layout + '.css');
    });


    //=======================================================
    // magnificPopup
    //=======================================================
    if ($('a.popup, a.popupBlog').length > 0) {
        $("a.popup, a.popupBlog").magnificPopup({
            type: 'image',
            gallery: {
                enabled: true
            }
        });
    }
    ;

    //========================
    // Mobile Menu
    //========================
    if ($('.mobileMenu, .mobileMenu2').length > 0) {
        $('.mobileMenu, .mobileMenu2').on('click', function () {
            $(this).toggleClass('active');
            $('.mainnav1 > ul, .mainnav2 > ul, .mainnav3 > ul').slideToggle('slow');
        });
        if ($(window).width() < 1280)
        {
            $(".mainnav1 li.has-menu-items > a, .mainnav2 li.has-menu-items > a, .mainnav3 li.has-menu-items > a").on('click', function () {
                $(this).parent().toggleClass('active');
                $(this).parent().children('.sub-menu, .megaMenu').slideToggle('slow');
                return false;
            });
        }

    }
    ;


    //========================
    // Contact Submit
    //========================
    if ($("#contactForm").length > 0)
    {
        $("#contactForm").on('submit', function (e) {
            e.preventDefault();
            $("#con_submit").html('Processsing...');
            var con_name, con_lname, con_email, con_message, con_sub;

            if ($("#con_name").length > 0) {
                var con_name = $("#con_name").val();
            }
            if ($("#con_email").length > 0) {
                var con_email = $("#con_email").val();
            }
            if ($("#con_message").length > 0) {
                var con_message = $("#con_message").val();
            }

            var required = 0;
            $(".required", this).each(function () {
                if ($(this).val() == '')
                {
                    $(this).addClass('reqError');
                    required += 1;
                } else
                {
                    if ($(this).hasClass('reqError'))
                    {
                        $(this).removeClass('reqError');
                        if (required > 0)
                        {
                            required -= 1;
                        }
                    }
                }
            });
            if (required === 0)
            {
                $.ajax({
                    type: "POST",
                    url: '../php/mail.php',
                    data: {con_name: con_name, con_email: con_email, con_message: con_message},
                    success: function (data)
                    {
                        $("#con_submit").html('Done!');
                        $("#contactForm input, #contactForm textarea").val('');
                    }
                });
            } else
            {
                $("#con_submit").html('Failed!');
            }

        });

        $(".required").on('keyup', function () {
            $(this).removeClass('reqError');
        });
    }




})(jQuery);
